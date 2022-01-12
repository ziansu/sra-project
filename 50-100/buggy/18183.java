private boolean chapMatchSrc(PolyGlot.CustomControls.GrammarChapNode curChap, java.lang.String src) {
    if (curChap.getName().contains(src)) {
        return true;
    }
    java.util.Enumeration sections = curChap.children();
    while (sections.hasMoreElements()) {
        PolyGlot.CustomControls.GrammarSectionNode curSec = ((PolyGlot.CustomControls.GrammarSectionNode) (sections.nextElement()));
        if (curSec.getName().contains(src)) {
            return true;
        }
    } 
    return false;
}