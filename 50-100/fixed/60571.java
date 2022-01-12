static int getLastMatchedTokenIndex(java.lang.String[] packageTokens, java.lang.String[] thisPackageTokens, int lastMatchedTokenIndex) {
    int result = 0;
    while (result < lastMatchedTokenIndex) {
        if (!(packageTokens[result].equals(thisPackageTokens[result]))) {
            break;
        }
        result++;
    } 
    return result;
}