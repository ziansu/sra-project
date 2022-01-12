org.jsoup.parser.Element insert(org.jsoup.parser.Token.StartTag startTag) {
    org.jsoup.parser.Tag tag = org.jsoup.parser.Tag.valueOf(startTag.name(), settings);
    org.jsoup.parser.Element el = new org.jsoup.parser.Element(tag, baseUri, settings.normalizeAttributes(startTag.attributes));
    insertNode(el);
    if (startTag.isSelfClosing()) {
        tokeniser.acknowledgeSelfClosingFlag();
        if (!(tag.isKnownTag()))
            tag.setSelfClosing();
        
    }else {
        stack.add(el);
    }
    return el;
}