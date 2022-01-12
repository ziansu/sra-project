public byte getBit(int position) {
    int block = position / 32;
    int positionInBlock = position % 32;
    if (((number[block]) & (1L << (((pl.kryptografia.rabin.bignum.BigNum.BLOCK_SIZE) - positionInBlock) - 1))) != 0) {
        return 1;
    }else {
        return 0;
    }
}