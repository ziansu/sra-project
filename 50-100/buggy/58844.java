private void recieveData() throws java.io.IOException {
    try {
        double guardPosX = ((double) (input.readDouble()));
        double guardPosY = ((double) (input.readDouble()));
        double guardPosZ = ((double) (input.readDouble()));
        double[] newPos = new double[]{ guardPosX , guardPosY , guardPosZ };
        player.setGuardPosition(newPos);
    } catch (java.lang.Exception e) {
    }
}