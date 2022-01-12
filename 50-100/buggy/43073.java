public boolean searchMatch(java.lang.String data, java.lang.String input) {
    for (int i = 0; i < (input.length()); i++) {
        if ((data.charAt(i)) != (input.charAt(i))) {
            program.Controller.log.debug(("LOGGER: char - " + (data.charAt(i))));
            return false;
        }
    }
    return true;
}