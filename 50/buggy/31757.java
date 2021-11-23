public int next(int tokenIndex) {
    synchronize();
    return tokenIndex < (this.tokenCacheEOFIndex) ? tokenIndex + 1 : this.tokenCacheEOFIndex;
}