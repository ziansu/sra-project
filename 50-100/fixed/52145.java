public void setResponse(boolean isResponse) {
    int value = (isResponse) ? ru.hardcoders.dns.DNSHeaderHelper.FIRST_BIT_MASK : 0;
    this.message[ru.hardcoders.dns.DNSHeaderHelper.FIRST_FLAG_INDEX] = ((byte) ((((this.message[ru.hardcoders.dns.DNSHeaderHelper.FIRST_FLAG_INDEX]) | (ru.hardcoders.dns.DNSHeaderHelper.FIRST_BIT_MASK)) ^ (ru.hardcoders.dns.DNSHeaderHelper.FIRST_BIT_MASK)) | (ru.hardcoders.dns.DNSHeaderHelper.FIRST_BIT_MASK)));
}