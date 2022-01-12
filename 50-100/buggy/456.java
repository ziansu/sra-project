protected void checkInputValidity(java.lang.String input) throws tools.obfuscation.keyobfuscator.exception.InvalidInputException {
    if (input.isEmpty())
        throw new tools.obfuscation.keyobfuscator.exception.InvalidInputException("Empty");
    
    if ((input.length()) != (length))
        throw new tools.obfuscation.keyobfuscator.exception.InvalidInputException("BadLength");
    
    if (regex.matcher(input).matches())
        throw new tools.obfuscation.keyobfuscator.exception.InvalidInputException("BadFormat");
    
}