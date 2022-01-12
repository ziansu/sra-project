@java.lang.Override
public boolean processWord(final net.xmlizer.wordhierarchy.Word word) {
    if ((word.getWord()) == null)
        return false;
    
    sb.append(word);
    sb.append((word.getChildren().isEmpty() ? "|" : ""));
    return false;
}