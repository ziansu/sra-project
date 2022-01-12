public void input() {
    try {
        br = new java.io.BufferedReader(new java.io.FileReader(fileName));
    } catch (java.io.IOException e) {
        java.lang.System.out.println("File not found");
    }
    java.util.Scanner terminalInput = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Hello! I am Dolores. Please ask me something");
    while (true) {
        java.lang.System.out.print(">");
        java.lang.String question = terminalInput.nextLine();
        JSONObject result = questionMatcher(question, stringToJSON());
        if (result != null)
            java.lang.System.out.println(getAnswer(result));
        else
            java.lang.System.out.println("Somehow you are not fit for the family life.");
        
    } 
}