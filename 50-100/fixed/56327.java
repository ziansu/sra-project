public void setValue(java.lang.String value) throws org.ejbca.ui.web.admin.configuration.InvalidCustomExtensionPropertyException {
    valueSearch : if ((possibleValues.length) > 0) {
        for (java.lang.String possibleValue : possibleValues) {
            if (value.equals(possibleValue)) {
                break valueSearch;
            }
        }
        return ;
    }
    this.value = value;
}