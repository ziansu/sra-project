public void receiveTarget() {
    try {
        java.io.BufferedReader localReader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
        java.lang.String msg = null;
        while ((msg = localReader.readLine()) != null) {
            if (!("bye".equals(msg))) {
                pingClient.Target target = new pingClient.Target(msg);
                addTarget(target);
            }else {
                shutdown = true;
                selector.wakeup();
                break;
            }
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}