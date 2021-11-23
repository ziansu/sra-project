@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isTagPrototype() {
    return (((tag) != null) && (!(tag.isEmpty()))) && (!(isManagedByTag()));
}