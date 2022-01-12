public void printAll(java.lang.String input, Server.chat.ServiceChat sendingService) {
    java.lang.String text = (((((sendingService.getName()) + "(ID: ") + (sendingService.getID())) + ")") + ": ") + input;
    control.appendText(text);
    addToLog(text);
    for (Server.chat.ServiceChat service : services) {
        service.print(input, sendingService.getName());
    }
}