private void CheckForSemicolon() {
    if (mIsBinaryFormat)
        return ;
    
    if ((GetNextToken()) != ";")
        ThrowException("Semicolon expected.");
    
}