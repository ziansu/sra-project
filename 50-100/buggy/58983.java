@java.lang.Override
public void run() {
    try {
        while (true) {
            java.lang.Thread.sleep(16);
            fillImageIDs();
            runOnUiThread(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    updateTokensPane();
                    updateAttributesPane();
                }
            });
        } 
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}