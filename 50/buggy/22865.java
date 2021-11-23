private java.lang.String getPath(java.lang.String extra) {
    if (extra.equals("")) {
        return "Jails." + (this.getName());
    }
    return (("Jails." + (this.getName())) + ".") + extra;
}