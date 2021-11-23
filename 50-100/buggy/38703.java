public void setBit(int position, int value) {
    int block = position / 32;
    int positionInBlock = position % 32;
    if (value == 1) {
        number[block] |= 1 << (((pl.kryptografia.rabin.bignum.BigNum.BLOCK_SIZE) - positionInBlock) - 1);
    }else
        if (value == 0) {
            number[block] &= ~(1 << (((pl.kryptografia.rabin.bignum.BigNum.BLOCK_SIZE) - positionInBlock) - 1));
        }
    
}