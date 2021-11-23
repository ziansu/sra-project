public int hashCode() {
    int hashCode = 11;
    hashCode ^= ((character) << 21) | ((character) >>> 11);
    return hashCode;
}