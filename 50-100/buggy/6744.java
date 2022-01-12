public boolean hasOrders(java.lang.String value) {
    for (int i = 0; i < (fields.size()); i++) {
        java.lang.String option = ((java.lang.String) (orderFields.elementAt(i)));
        if ((option.toLowerCase().compareTo(value.toLowerCase())) == 0)
            return true;
        
    }
    return false;
}