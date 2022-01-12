public boolean equals(java.lang.Object other) {
    if ((other != null) && (other instanceof model.roster.Student)) {
        model.roster.Student oth = ((model.roster.Student) (other));
        return (oth.getName().equals(name)) && (oth.getId().equals(id));
    }
    return false;
}