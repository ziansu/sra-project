public java.lang.String execute(java.lang.String moveName) {
    java.util.Iterator<model.actions.Move> iterator = this.moves.iterator();
    model.actions.Move move;
    java.lang.String localString = "Invalid Action";
    while (iterator.hasNext()) {
        move = iterator.next();
        if (move.getName().equals(moveName)) {
            move.execute();
            localString = move.getResultMessage();
        }
    } 
    return localString;
}