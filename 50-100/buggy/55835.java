public static char getAlphaAtPos(int pos, com.subbu.crypto.utils.CryptoUtils.CASE _case) {
    char _charAtPos = ' ';
    if (_case == (com.subbu.crypto.utils.CryptoUtils.CASE.LOWERCASE)) {
        com.subbu.crypto.utils.CryptoUtils.logger.debug("Lowercase");
        _charAtPos = ((char) ((97 + pos) - 1));
    }else
        if (_case == (com.subbu.crypto.utils.CryptoUtils.CASE.UPPERCASE)) {
            com.subbu.crypto.utils.CryptoUtils.logger.debug("Uppercase");
            _charAtPos = ((char) ((65 + pos) - 1));
        }
    
    return _charAtPos;
}