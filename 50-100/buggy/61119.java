public void run() {
    while (running) {
        try {
            java.lang.String[] oldData = data;
            data = streamIn.readUTF().split("-");
            if (!(oldData.equals(data))) {
                client.readInput();
                java.lang.System.out.println(java.util.Arrays.toString(data));
            }
        } catch (java.io.IOException ioe) {
            java.lang.System.out.println(("Listening error: " + (ioe.getMessage())));
        }
    } 
}