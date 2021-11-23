public int[] decrypt(int[] cipher, int[] key) {
    bonek.Block[] b = toArrayBlock(cipher);
    return toArrayInt(decrypt(b, key));
}