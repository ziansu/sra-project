public void handle(org.flasck.flas.tokenizers.Tokenizable line, java.util.List<org.flasck.flas.blockForm.Block> nested) {
    if (!(line.hasMore()))
        return ;
    
    org.flasck.flas.tokenizers.KeywordToken kw = org.flasck.flas.tokenizers.KeywordToken.from(line);
    if (kw.text.equals("assert"))
        handleAssert(line, nested);
    else
        builder.error(("cannot handle input line: " + (kw.text)));
    
}