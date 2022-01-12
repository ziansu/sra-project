public synchronized boolean writeBulk(java.nio.ByteBuffer data, int size) {
    if (!(data.isDirect()))
        throw new java.lang.IllegalArgumentException("must be a direct buffer");
    
    if ((data.capacity()) < size)
        throw new java.lang.IllegalArgumentException(("buffer is too small, must be at least " + size));
    
    return (edu.wpi.first.wpilibj.hal.I2CJNI.i2CWrite(((byte) (m_port.getValue())), ((byte) (m_deviceAddress)), data, ((byte) (size)))) < size;
}