@java.lang.Override
public H.Response writeBinary(org.osgl.storage.ISObject binary) {
    realResponse.writeBinary(binary);
    this.binary = binary.asByteArray();
    return this;
}