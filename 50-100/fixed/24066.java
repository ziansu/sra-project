public static java.util.Map<edu.stanford.bmir.protege.web.shared.xd.data.entityframes.OntologyEntityFrame, java.lang.Integer> getFrameTreeAsIndentMap(edu.stanford.bmir.protege.web.shared.xd.data.FrameTreeNode<edu.stanford.bmir.protege.web.shared.xd.data.entityframes.OntologyEntityFrame> topNode) {
    java.util.Map<edu.stanford.bmir.protege.web.shared.xd.data.entityframes.OntologyEntityFrame, java.lang.Integer> retVal = new java.util.HashMap<edu.stanford.bmir.protege.web.shared.xd.data.entityframes.OntologyEntityFrame, java.lang.Integer>();
    if (topNode.getChildren().isEmpty()) {
        retVal.put(topNode.getData(), 0);
    }else {
        for (edu.stanford.bmir.protege.web.shared.xd.data.FrameTreeNode<edu.stanford.bmir.protege.web.shared.xd.data.entityframes.OntologyEntityFrame> childNode : topNode.getChildren()) {
            retVal.putAll(edu.stanford.bmir.protege.web.shared.xd.util.TreeMethods.getFrameTreeAsIndentMap(childNode, 0));
        }
    }
    return retVal;
}