public void automatedPointCalculation(java.awt.image.BufferedImage image) {
    try {
        outStream.write(((plugComm.Comm2Helper.prepAutoMessage(image).toString()) + "\n"));
        outStream.flush();
    } catch (java.lang.Exception e) {
    }
}