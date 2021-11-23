private void CheckForClosingBrace() {
    if ((GetNextToken()) != "}")
        ThrowException("Closing brace expected.");
    
}