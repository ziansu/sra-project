public java.lang.String readString(java.lang.String prompt) {
    java.lang.System.out.print(prompt);
    try {
        java.lang.String inputStr = buffInput.readLine();
        return inputStr;
    } catch (java.io.IOException E) {
        return "";
    }
}