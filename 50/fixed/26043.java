public void setContent(java.lang.String content) {
    this.source = content;
    this.content = com.sysc4806.MarkdownTranslator.translate(content);
}