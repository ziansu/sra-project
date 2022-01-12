private static boolean isValidMoveInput(java.lang.String userInput) {
    java.lang.String[] split = userInput.split(",");
    try {
        java.lang.Integer.parseInt(split[0].trim());
        java.lang.Integer.parseInt(split[1].trim());
        return true;
    } catch (java.lang.Exception e) {
        view.Console.writeLine("\n!!! The format in which you input your action was incorrect !!!\n");
    }
    return false;
}