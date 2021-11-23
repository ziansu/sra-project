public void run() {
    while (true) {
        try {
            java.lang.String message;
            int length = input.readInt();
            if (length > 0) {
                byte[] b = new byte[length];
                input.readFully(b);
                message = new java.lang.String(b, "UTF-8");
                this.sendMessage(network.AppWorker.handleMessage(message));
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
            break;
        }
    } 
}