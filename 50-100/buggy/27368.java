public static lv.ailab.lvtb.universalizer.conllu.UDv2Relations predClToUD(org.w3c.dom.Node aNode) throws javax.xml.xpath.XPathExpressionException {
    java.lang.String parentType = lv.ailab.lvtb.universalizer.transformator.syntax.Utils.getAnyLabel(lv.ailab.lvtb.universalizer.transformator.syntax.Utils.getPMLParent(aNode));
    if (parentType.equals(LvtbRoles.PRED))
        return lv.ailab.lvtb.universalizer.conllu.UDv2Relations.CCOMP;
    
    java.lang.String grandPatentType = lv.ailab.lvtb.universalizer.transformator.syntax.Utils.getAnyLabel(lv.ailab.lvtb.universalizer.transformator.syntax.Utils.getPMLGrandParent(aNode));
    if (grandPatentType.equals(LvtbXTypes.XPRED))
        return lv.ailab.lvtb.universalizer.conllu.UDv2Relations.ACL;
    
    lv.ailab.lvtb.universalizer.transformator.syntax.DepRelLogic.warn(aNode);
    return lv.ailab.lvtb.universalizer.conllu.UDv2Relations.DEP;
}