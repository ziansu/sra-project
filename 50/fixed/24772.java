private long getBitboardFromNumber(long bitboardNumber, long precomputedBitboard, long opponentBitboard, long occupiedBitboard) {
    bitboardNumber = bitboardNumber & precomputedBitboard;
    bitboardNumber = bitboardNumber ^ precomputedBitboard;
    return bitboardNumber;
}