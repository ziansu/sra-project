private de.neuland.jade4j.parser.Node parseBlockCode() {
    de.neuland.jade4j.parser.Token tok = this.expect(de.neuland.jade4j.parser.BlockCode.class);
    de.neuland.jade4j.parser.CodeNode node;
    de.neuland.jade4j.parser.Token body = this.peek();
    java.lang.String text;
    if (body instanceof de.neuland.jade4j.parser.PipelessText) {
        this.advance();
        text = org.apache.commons.lang3.StringUtils.join("\n", body.getValues());
    }else {
        text = "";
    }
    node = new de.neuland.jade4j.parser.CodeNode();
    node.setValue(text);
    node.setLineNumber(tok.getLineNumber());
    return node;
}