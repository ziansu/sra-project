public void run() {
    try {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(clientSocket.getInputStream()));
        java.lang.String line = in.readLine();
        while (line != null) {
            node.handleMessages(line);
            line = in.readLine();
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
}