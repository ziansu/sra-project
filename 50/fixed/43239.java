public java.lang.String execute(javax.servlet.http.HttpServletRequest request) {
    search(request);
    com.itechart.bukinevi.logic.commands.maincommands.ContactCommand contactCommand = new com.itechart.bukinevi.logic.commands.maincommands.ContactCommand();
    return contactCommand.execute(request);
}