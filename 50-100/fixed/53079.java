protected java.util.List<com.onpositive.text.analysis.IToken> collectParents(com.onpositive.text.analysis.IToken ch) {
    java.util.List<com.onpositive.text.analysis.IToken> parents = ((ch.getParents()) == null) ? new java.util.ArrayList<com.onpositive.text.analysis.IToken>() : new java.util.ArrayList<com.onpositive.text.analysis.IToken>(ch.getParents());
    java.util.Set<com.onpositive.text.analysis.IToken> newParents = parentsMap.get(ch.id());
    if (newParents != null)
        parents.addAll(newParents);
    
    return parents;
}