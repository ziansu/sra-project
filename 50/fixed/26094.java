public void setWord(int startIndex, int length) {
    replace(startIndex, length, null, ProcessedString.TokenType.Word);
}