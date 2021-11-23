private void CheckForClosingBrace() {
    if (!("}".equals(GetNextToken())))
        ThrowException("Closing brace expected.");
    
}