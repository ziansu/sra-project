public wyil.util.AttributedCodeBlock createSubBlock() {
    wyil.lang.CodeBlock.Index index = new wyil.lang.CodeBlock.Index(ID, 0);
    return new wyil.util.AttributedCodeBlock(index, this);
}