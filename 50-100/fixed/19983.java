public edu.emory.mathcs.nlp.component.template.node.NLPNode[] processDependency(java.util.List<java.lang.String> sentence) {
    if ((getDependecyModel()) == null)
        initDependecyModel();
    
    edu.emory.mathcs.nlp.decode.NLPDecoder decoder = getDecoder(getDependecyModel());
    edu.emory.mathcs.nlp.component.template.node.NLPNode[] nodes = decoder.toNodeArray(convertArrayStringToListToken(sentence));
    return decoder.decode(nodes);
}