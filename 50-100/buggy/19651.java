private org.w3c.dom.Node getMaxInputParentNoOtherInput(org.w3c.dom.Node inputNode, boolean inputInForm) {
    org.w3c.dom.Node tempParent = inputNode.getParentNode();
    org.w3c.dom.Node maxInputParentNoOtherInput = tempParent;
    while ((getNumberOfUserChangableInputsInNode(tempParent)) <= 1) {
        maxInputParentNoOtherInput = tempParent;
        if (inputInForm && (tempParent.getNodeName().equalsIgnoreCase("form"))) {
            break;
        }
        tempParent = tempParent.getParentNode();
    } 
    return maxInputParentNoOtherInput;
}