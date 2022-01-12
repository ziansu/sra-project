protected com.ge.research.sadl.sADL.Declaration getDeclarationFromSubjHasProp(com.ge.research.sadl.sADL.SubjHasProp subject) {
    com.ge.research.sadl.sADL.Expression left = subject.getLeft();
    if (left instanceof com.ge.research.sadl.sADL.Declaration) {
        return ((com.ge.research.sadl.sADL.Declaration) (left));
    }else
        if (left instanceof com.ge.research.sadl.sADL.SubjHasProp) {
            return getDeclarationFromSubjHasProp(((com.ge.research.sadl.sADL.SubjHasProp) (left)));
        }else
            if (left instanceof com.ge.research.sadl.sADL.CommaSeparatedAbreviatedExpression) {
                return getDeclarationFromSubjHasProp(((com.ge.research.sadl.sADL.CommaSeparatedAbreviatedExpression) (left)));
            }
        
    
    return null;
}