public void input() {
    java.util.Scanner terminalInput = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Hello! I am Dolores. Please ask me something");
    while (true) {
        try {
            br = new java.io.BufferedReader(new java.io.FileReader(fileName));
        } catch (java.io.IOException e) {
            java.lang.System.out.println("File not found");
        }
        java.lang.System.out.print(">");
        java.lang.String question = terminalInput.nextLine();
        JSONObject result;
        do {
            result = questionMatcher(question, stringToJSON());
        } while (result == null );
        java.lang.System.out.println(getAnswer(result));
    } 
}