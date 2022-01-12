private int writeSprite(byte[] spriteData) {
    int size = spriteData.length;
    int bankBytesLeft = (SpritesToROM.BANK_SIZE) - ((dataAddr) % (SpritesToROM.BANK_SIZE));
    if (bankBytesLeft < size) {
        dataAddr += bankBytesLeft + (SpritesToROM.HEADER_SIZE);
    }
    int tmp = dataAddr;
    writeIndex(dataAddr);
    dataAddr += writeBytes(rom, dataAddr, spriteData);
    return tmp;
}