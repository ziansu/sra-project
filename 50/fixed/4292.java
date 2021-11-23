private boolean matchesNameSpace(java.lang.String otherNameSpace) {
    if (otherNameSpace == null) {
        return false;
    }
    java.lang.String nameSpace = healthCodeTaxonomy.getNameSpace();
    java.text.Collator collator = rifServices.system.RIFServiceMessages.getCollator();
    return collator.equals(nameSpace, otherNameSpace);
}