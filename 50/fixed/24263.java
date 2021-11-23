public java.lang.String getSousTitre() {
    java.lang.String t = "";
    if ((this.getOeuvre()) != null) {
        t = this.getOeuvre().getSousTitre();
    }
    return t;
}