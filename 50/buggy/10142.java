public byte[] getSubnegotiation() {
    byte[] subnegotiation = new byte[this.subnegotiation.length];
    java.lang.System.arraycopy(this.subnegotiation, 0, subnegotiation, 0, subnegotiation.length);
    return subnegotiation;
}