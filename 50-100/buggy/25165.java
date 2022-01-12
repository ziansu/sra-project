@java.lang.Override
public boolean equals(java.lang.Object other) {
    if ((this) == other) {
        return true;
    }
    if (!(other instanceof User)) {
        return false;
    }
    User theOther = ((User) (other));
    return this.getName().equals(theOther.getName());
}