private boolean isVariableDefinition(com.ge.research.sadl.sADL.Declaration decl) {
    if ((!(isDefiniteArticle(decl.getArticle()))) && ((isDeclInThereExists(decl)) || ((decl.getType()) instanceof com.ge.research.sadl.sADL.SadlSimpleTypeReference))) {
        return true;
    }
    return false;
}