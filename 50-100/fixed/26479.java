public void proposeNewGame() {
    try {
        Model.GameActionObject gao = new Model.GameActionObject(0, (-1));
        objOut.writeObject(gao);
        objOut.flush();
    } catch (java.io.IOException e) {
        java.lang.System.err.print(e);
    }
}