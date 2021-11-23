public synchronized boolean writeBulk(byte[] data) {
    java.nio.ByteBuffer dataToSendBuffer = java.nio.ByteBuffer.allocateDirect(data.length);
    dataToSendBuffer.put(data);
    return (edu.wpi.first.wpilibj.hal.I2CJNI.i2CWrite(((byte) (m_port.getValue())), ((byte) (m_deviceAddress)), dataToSendBuffer, ((byte) (data.length)))) < (data.length);
}