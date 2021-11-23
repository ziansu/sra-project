private void findUrlCandidates(com.google.javascript.rhino.Node currentNode, java.util.List<java.lang.String> urlCandidates) {
    if (currentNode.isString()) {
        if (currentNode.getString().contains(".")) {
            urlCandidates.add(currentNode.getString());
        }
    }
    for (com.google.javascript.rhino.Node child : currentNode.children()) {
        findUrlCandidates(child, urlCandidates);
    }
}