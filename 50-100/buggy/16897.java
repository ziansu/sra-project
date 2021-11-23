public static void conversationHandler(java.io.PrintWriter out, java.io.BufferedReader in, java.util.Scanner clientInput, java.lang.String userName) throws java.lang.Exception {
    while (true) {
        java.lang.String serverText;
        serverText = in.readLine();
        java.lang.System.out.println(("Server: " + serverText));
        java.lang.String clientText = clientInput.nextLine();
        out.println(((userName + ": ") + clientText));
        java.lang.System.out.println(((userName + ": ") + clientText));
    } 
}