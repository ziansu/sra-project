@java.lang.Override
public com.google.codeu.codingchallenge.JSON setString(java.lang.String name, java.lang.String value) {
    if ((list.containsKey(name)) && ((list.get(name)) instanceof java.lang.String)) {
        list.remove(name);
        list.put(name, value);
    }
    return this;
}