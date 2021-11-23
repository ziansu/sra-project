@java.lang.Override
public java.lang.String newId(java.lang.String prefix) {
    int counter = (lastId) + 1;
    java.lang.String id = (prefix + "-") + counter;
    while (ids.contains(id)) {
        counter++;
        id = "" + counter;
    } 
    ids.add(id);
    lastId = counter;
    return id;
}