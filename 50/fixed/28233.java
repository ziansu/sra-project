public void tryMove(java.lang.String dir) {
    if (!(canMove())) {
        java.lang.System.out.println("cant move");
        return ;
    }
    move(currentPlayer, dir);
}