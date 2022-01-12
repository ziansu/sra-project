@java.lang.Override
public void executeFirstOperation() {
    if (isIdle()) {
        java.lang.Thread t = new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                switchToBusyState(Operation.FIRST_OPERATION);
                try {
                    java.lang.Thread.sleep(2000);
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
                mFirstOperationOutcome = com.bolyartech.forge.android.app_unit.OperationOutcome.createSuccessOutcome(42);
                switchToEndedStateSuccess();
            }
        });
        t.start();
    }
}