public void setDefault(java.util.ArrayList<Syntax.Statement> defaults) {
    check((defaults != null), "duplicated default in switch");
    this.defaults = defaults;
}