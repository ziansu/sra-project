private int countDirectivesCode(java.util.TreeSet<de.ovgu.featureide.core.fstmodel.preprocessor.FSTDirective> directives) {
    java.util.Iterator<de.ovgu.featureide.core.fstmodel.preprocessor.FSTDirective> iterator = directives.iterator();
    int locForDirectives = 0;
    while (iterator.hasNext()) {
        de.ovgu.featureide.core.fstmodel.preprocessor.FSTDirective directive = iterator.next();
        locForDirectives += ((directive.getEndLine()) - (directive.getStartLine())) - 1;
    } 
    return locForDirectives;
}