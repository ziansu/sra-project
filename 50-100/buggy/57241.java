public synchronized void setCurvature(double courbure) {
    java.nio.ByteBuffer data = java.nio.ByteBuffer.allocate(2);
    short courbureShort = ((short) (java.lang.Math.round((courbure * 100))));
    data.putShort(courbureShort);
    bufferBassePriorite.add(new serie.trame.Order(serie.SerialProtocol.OutOrder.SET_CURVATURE));
    notify();
}