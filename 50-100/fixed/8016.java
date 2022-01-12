public lv.ailab.lvtb.universalizer.conllu.UDv2Relations advSitToUD(org.w3c.dom.Node aNode) throws javax.xml.xpath.XPathExpressionException {
    java.lang.String tag = lv.ailab.lvtb.universalizer.transformator.syntax.Utils.getTag(aNode);
    if (tag.matches("n.*|xn.*|p.*|.*\\[(pre|post|rel).*|mc.*|y.*"))
        return lv.ailab.lvtb.universalizer.conllu.UDv2Relations.OBL;
    
    java.lang.String lemma = lv.ailab.lvtb.universalizer.transformator.syntax.Utils.getLemma(aNode);
    if ((tag.matches("r.*")) || (lemma.equals("%")))
        return lv.ailab.lvtb.universalizer.conllu.UDv2Relations.ADVMOD;
    
    if (tag.matches("q.*"))
        return lv.ailab.lvtb.universalizer.conllu.UDv2Relations.DISCOURSE;
    
    warn(aNode);
    return lv.ailab.lvtb.universalizer.conllu.UDv2Relations.DEP;
}