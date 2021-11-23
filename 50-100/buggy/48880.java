private java.lang.Object[] sendNewText(java.lang.String text) throws java.io.IOException {
    locked = true;
    if ((pl.asie.computronics.Computronics.tts) != null) {
        Computronics.tts.say(text, worldObj.provider.dimensionId, xCoord, yCoord, zCoord);
    }else {
        return new java.lang.Object[]{ false , "text-to-speech system not available" };
    }
    return new java.lang.Object[]{ true };
}