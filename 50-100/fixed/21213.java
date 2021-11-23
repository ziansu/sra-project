public java.util.List<java.lang.String> projectIds() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    for (java.lang.Object project : ((java.util.List) (this.manifest.get("projects").value()))) {
        org.unfoldingword.resourcecontainer.ObjectReader p = new org.unfoldingword.resourcecontainer.ObjectReader(project);
        list.add(((java.lang.String) (p.get("identifier").value())));
    }
    return list;
}