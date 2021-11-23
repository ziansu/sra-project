@java.lang.Override
public boolean equals(java.lang.Object o) {
    boolean isEqual = false;
    if (o instanceof model.User) {
        model.User other = ((model.User) (o));
        isEqual = myEmail.equals(other.getEmail());
    }
    return isEqual;
}