public static void conversationHandler(java.io.PrintWriter outputToClient, java.io.BufferedReader inputFromClient) throws java.io.IOException {
    java.util.Scanner serverInput = new java.util.Scanner(java.lang.System.in);
    java.lang.String clientText;
    java.lang.String serverText;
    while (true) {
        if ((serverText = serverInput.nextLine()) != null) {
            outputToClient.println(serverText);
            java.lang.System.out.println(("Server: " + serverText));
        }else
            if ((clientText = inputFromClient.readLine()) != null) {
                java.lang.System.out.println(clientText);
            }
        
    } 
}