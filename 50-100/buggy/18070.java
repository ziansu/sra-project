private void WriteByte(byte data) throws java.io.IOException {
    if ((mode) == (APIMode.ESCAPED)) {
        if ((((data == (KEY)) || (data == (ESCAPED))) || (data == (XON))) || (data == (XOFF))) {
            _WriteByte(ESCAPED);
            _WriteByte(((byte) (data ^ 32)));
            return ;
        }
    }
    _WriteByte(data);
}