public void statePlayer(java.lang.String address, com.jme3.math.Vector3f walk, com.jme3.math.Vector3f view, int life, boolean attack, int score) {
    try {
        this.OUTPUT.writeBytes(((server.ClientManager.PLAYER) + "\n"));
        java.lang.String line = new java.lang.StringBuilder().builderString(walk, view, new com.jme3.math.Vector3f(), life, attack, address, "", score);
        this.OUTPUT.writeBytes((line + "\n"));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}