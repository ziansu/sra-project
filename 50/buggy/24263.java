public java.lang.String getsousTitre() {
    java.lang.String t = "";
    if ((this.getOeuvre()) != null) {
        t = this.getOeuvre().getSousTitre();
    }
    return t;
}