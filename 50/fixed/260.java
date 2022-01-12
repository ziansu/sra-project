public boolean equals(java.lang.Object field) {
    if (!(field instanceof simpledb.StringField))
        return false;
    
    return ((simpledb.StringField) (field)).value.equals(value);
}