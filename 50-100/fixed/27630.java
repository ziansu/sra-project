public void removeProperty(java.lang.String property) {
    try {
        int indexOf = columns.indexOf(property);
        if (indexOf != (-1)) {
            columns.remove(indexOf);
            values.remove(indexOf);
        }
    } catch (java.lang.IndexOutOfBoundsException ex) {
        java.util.logging.Logger.getLogger(za.co.jumpingbean.jpaunit.DataSetEntry.class.getName()).log(java.util.logging.Level.SEVERE, java.text.MessageFormat.format("Error removing property {0}", property), ex);
    }
}