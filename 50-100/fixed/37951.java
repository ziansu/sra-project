@java.lang.Override
public java.lang.String toString() {
    if (("Organisation".equals(this.type)) || ("Unapproved Organisation".equals(this.type))) {
        return this.organisationName;
    }else {
        return ((this.firstName) + " ") + (this.surname);
    }
}