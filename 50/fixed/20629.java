@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isTagPrototype() {
    boolean result = (((tag) != null) && (!(tag.isEmpty()))) && (!(isManagedByTag()));
    return result;
}