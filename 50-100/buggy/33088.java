public void run() {
    try {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(clientSocket.getInputStream()));
        while (true) {
            java.lang.String line = in.readLine();
            node.handleMessages(line);
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
}