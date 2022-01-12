public void removeRareAttributes(boolean auto) {
    int option = 0;
    this.df = regroupDFJoint().getDFJoint();
    java.util.List<datastructures.RareElement> rareAttrVector = findRareAttributes();
    while (!(rareAttrVector.isEmpty())) {
        if (!auto) {
        }
        removeAttribute(rareAttrVector.get(option));
        rareAttrVector = findRareAttributes();
    } 
}