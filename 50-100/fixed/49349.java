public java.lang.String getLastName() {
    if (((lastName) == null) || (lastName.equals(""))) {
        int space = getFullName().indexOf(" ");
        if (space > (-1)) {
            this.lastName = getFullName().substring((space + 1));
        }
    }
    return lastName;
}