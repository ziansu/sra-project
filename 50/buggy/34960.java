public boolean matchesData(byte data, int mod) {
    return ((this.data) % mod) == data;
}