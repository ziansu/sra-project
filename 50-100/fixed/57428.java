public boolean equals(java.lang.Object other) {
    if ((other != null) && (other instanceof model.roster.Student)) {
        model.roster.Student oth = ((model.roster.Student) (other));
        return oth.getId().equals(id);
    }else
        if ((other != null) && (other instanceof java.lang.String)) {
            java.lang.String oth = ((java.lang.String) (other));
            return oth.equals(id);
        }
    
    return false;
}