private boolean skipAllCommentsAndWhitespaces() {
    pos.walkAfterWhitespaces();
    while (pos.startsWithCC("<!--")) {
        rocks.inspectit.agent.java.eum.Carret end = pos.copy();
        boolean endFound = end.walkAfterMatchCC("-->");
        if (endFound) {
            pos.goTo(end.getOffset());
            pos.walkAfterWhitespaces();
        }else {
            return false;
        }
    } 
    return true;
}