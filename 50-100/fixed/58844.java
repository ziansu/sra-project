private void recieveData() throws java.io.IOException {
    try {
        double guardPosX = ((double) (input.readDouble()));
        double guardPosY = ((double) (input.readDouble()));
        double guardPosZ = ((double) (input.readDouble()));
        java.lang.System.out.println(guardPosZ);
        double[] newPos = new double[]{ guardPosX , guardPosY , 0 };
        player.setGuardPosition(newPos);
    } catch (java.lang.Exception e) {
    }
}