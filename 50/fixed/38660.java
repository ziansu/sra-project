private boolean isSW(com.textocat.textokit.segmentation.heur.Token tok) {
    if (tok == null)
        return false;
    
    return (tok.getTypeIndexID()) == (SW.type);
}