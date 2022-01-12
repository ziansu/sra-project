private int countLOCOfDirectives(java.util.TreeSet<de.ovgu.featureide.core.fstmodel.preprocessor.FSTDirective> directives) {
    java.util.Iterator<de.ovgu.featureide.core.fstmodel.preprocessor.FSTDirective> iterator = directives.iterator();
    int locOfDirectiveBody = 0;
    while (iterator.hasNext()) {
        de.ovgu.featureide.core.fstmodel.preprocessor.FSTDirective directive = iterator.next();
        int childrenLOC = countChildrenLOC(directive);
        locOfDirectiveBody += ((directive.getEndLine()) - (directive.getStartLine())) - 1;
        locOfDirectiveBody -= childrenLOC;
    } 
    return locOfDirectiveBody;
}