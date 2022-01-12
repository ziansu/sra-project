public java.util.ArrayList<com.claudiop.vendingmachine.Action> parse(java.lang.String input) {
    if (input.trim().equals("")) {
        return null;
    }else {
        this.buffer = (this.continuous) ? (this.buffer) + input : input;
        filterLastCommands();
        return findActions();
    }
}