@java.lang.Override
public com.google.codeu.codingchallenge.JSON setObject(java.lang.String name, com.google.codeu.codingchallenge.JSON value) {
    if ((list.containsKey(name)) && ((list.get(name)) instanceof com.google.codeu.codingchallenge.JSON))
        list.remove(name);
    
    list.put(name, value);
    return this;
}