private int writeSprite(byte[] spriteData) {
    java.lang.System.out.println(("Data addr=" + (dataAddr)));
    int size = spriteData.length;
    int bankBytesLeft = (SpritesToROM.BANK_SIZE) - ((dataAddr) % (SpritesToROM.BANK_SIZE));
    if (bankBytesLeft < size) {
        dataAddr += bankBytesLeft + (SpritesToROM.HEADER_SIZE);
    }
    writeIndex(dataAddr);
    dataAddr += writeBytes(rom, dataAddr, spriteData);
    return size;
}