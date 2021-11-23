@java.lang.Override
public java.lang.String toString() {
    if (((this.type) == "Organisation") || ((this.type) == "Unapproved Organisation")) {
        return this.organisationName;
    }else {
        return ((this.firstName) + " ") + (this.surname);
    }
}