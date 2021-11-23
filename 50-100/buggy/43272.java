public static java.lang.String getCompleteName(java.lang.String lastName, java.lang.String tusvgl, java.lang.String firstName1, java.lang.String firstName2, java.lang.String firstName3) {
    java.lang.String completeName = ((((tusvgl.trim()) + " ") + (lastName.trim())) + ", ") + (org.iish.hsn.invoer.util.Utils.getFirstNames(firstName1, firstName2, firstName3));
    return completeName.trim();
}