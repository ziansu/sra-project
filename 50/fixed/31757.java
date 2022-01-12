public int next(int tokenIndex) {
    synchronize();
    return (tokenIndex + 1) < (this.tokenCacheEOFIndex) ? tokenIndex + 1 : this.tokenCacheEOFIndex;
}