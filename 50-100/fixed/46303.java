@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o == (this)) {
        return true;
    }
    if (o == null) {
        return false;
    }
    if (!(o instanceof seedu.address.logic.autocomplete.AutoCompletePossibilities)) {
        return false;
    }
    seedu.address.logic.autocomplete.AutoCompletePossibilities otherObject = ((seedu.address.logic.autocomplete.AutoCompletePossibilities) (o));
    return stub.equals(otherObject.getStub());
}