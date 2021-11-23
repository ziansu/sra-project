public void setResponse(boolean isResponse) {
    int value = (isResponse) ? ru.hardcoders.dns.DNSHeaderHelper.FIRST_BIT_MASK : 0;
    java.lang.System.err.println("Before");
    java.lang.System.err.println(java.lang.Integer.toBinaryString(this.message[ru.hardcoders.dns.DNSHeaderHelper.FIRST_FLAG_INDEX]));
    this.message[ru.hardcoders.dns.DNSHeaderHelper.FIRST_FLAG_INDEX] = ((byte) ((((this.message[ru.hardcoders.dns.DNSHeaderHelper.FIRST_FLAG_INDEX]) | (ru.hardcoders.dns.DNSHeaderHelper.FIRST_BIT_MASK)) ^ (ru.hardcoders.dns.DNSHeaderHelper.FIRST_BIT_MASK)) | (ru.hardcoders.dns.DNSHeaderHelper.FIRST_BIT_MASK)));
    java.lang.System.err.println("After");
    java.lang.System.err.println(java.lang.Integer.toBinaryString(this.message[ru.hardcoders.dns.DNSHeaderHelper.FIRST_FLAG_INDEX]));
}