@java.lang.Override
public void run() {
    try {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
        while (!(shouldExit)) {
            if (!(in.readLine().toLowerCase().equals("stop"))) {
                in.close();
                shouldExit = true;
                socketAccepter.interrupt();
            }
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        shouldExit = true;
    }
}