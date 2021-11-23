public boolean exec() {
    boolean result = false;
    showCurrentExpression();
    try {
        while (true) {
            readLine("(nezdb) ");
            command.exec(this);
            if ((code) instanceof nez.vm.IExit) {
                code.exec(sc);
            }
            showCurrentExpression();
        } 
    } catch (nez.vm.TerminationException e) {
        result = e.status;
    }
    return result;
}