public void bind(org.apache.fop.fo.PropertyList pList) throws org.apache.fop.apps.FOPException {
    super.bind(pList);
    commonAccessibility = org.apache.fop.fo.properties.CommonAccessibility.getInstance(pList);
}