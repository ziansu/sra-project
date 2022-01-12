@java.lang.Override
public void executeSecondOperation() {
    if (isIdle()) {
        switchToBusyState(Operation.SECOND_OPERATION);
        java.lang.Thread t = new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                try {
                    java.lang.Thread.sleep(2000);
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
                mSecondOperationOutcome = com.bolyartech.forge.android.app_unit.OperationOutcome.createSuccessOutcome(3.14F);
                switchToEndedStateSuccess();
            }
        });
        t.start();
    }
}