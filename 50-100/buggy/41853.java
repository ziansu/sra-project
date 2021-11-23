@java.lang.Override
public boolean equals(java.lang.Object o) {
    boolean isEqual = false;
    if (o instanceof model.User) {
        model.User other = ((model.User) (o));
        isEqual = ((myFirstName.equals(other.getFirstName())) && (myLastName.equals(other.getLastName()))) || (myEmail.equals(other.getEmail()));
    }
    return isEqual;
}