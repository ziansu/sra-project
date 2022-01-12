public static java.lang.String _readString(java.lang.String prompt) {
    java.io.BufferedReader userInput = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    java.lang.System.out.print(prompt);
    try {
        java.lang.String inputStr = userInput.readLine();
        return inputStr;
    } catch (java.io.IOException E) {
        return "";
    }
}