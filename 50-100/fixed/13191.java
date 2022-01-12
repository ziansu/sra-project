public byte lookup(javax.swing.text.Segment text, int offset, int length) {
    if (length == 0)
        return processing.app.syntax.Token.NULL;
    
    de.bezier.mode.coffeescript.syntax.CSKeywordMap.Keyword k = map[getSegmentMapKey(text, offset, length)];
    while (k != null) {
        if (length != (k.keyword.length)) {
            k = k.next;
            continue;
        }
        if (regionMatches(ignoreCase, text, offset, k.keyword))
            return k.id;
        
        k = k.next;
    } 
    return processing.app.syntax.Token.NULL;
}