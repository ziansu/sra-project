public boolean proposeNewGame() {
    try {
        Model.GameActionObject gao = new Model.GameActionObject(0, (-1));
        objOut.writeObject(gao);
        objOut.flush();
        return objIn.readBoolean();
    } catch (java.io.IOException e) {
        java.lang.System.err.print(e);
    }
    return false;
}