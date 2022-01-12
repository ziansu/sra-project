public void setContent(java.lang.Object obj) {
    if ((Content) == null) {
        Content = new java.util.ArrayList<java.lang.Object>();
    }
    if ((obj instanceof java.lang.String) | (obj instanceof eu.learnpad.ca.rest.data.Node)) {
        this.Content.add(obj);
    }
}