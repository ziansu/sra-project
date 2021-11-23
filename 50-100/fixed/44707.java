public void handle(org.flasck.flas.tokenizers.Tokenizable line, java.util.List<org.flasck.flas.blockForm.Block> nested) {
    org.flasck.flas.tokenizers.KeywordToken kw = org.flasck.flas.tokenizers.KeywordToken.from(line);
    if (kw == null)
        return ;
    
    if (kw.text.equals("assert"))
        handleAssert(line, nested);
    else
        builder.error(("cannot handle input line: " + (kw.text)));
    
}