protected java.lang.String getValidInputFromUser(java.lang.String message, jdbchomework.console.InputType type) {
    java.lang.System.out.println(message);
    java.lang.String input = "";
    try {
        input = jdbchomework.MainWithJdbc.getReader().readLine();
        while (!(type.getIsValid().test(input))) {
            java.lang.System.out.println(type.getErrorMessage());
            input = jdbchomework.MainWithJdbc.getReader().readLine();
        } 
    } catch (java.io.IOException e) {
        log.error(java.lang.String.format("Error reading user input from console"), e);
    }
    return input;
}