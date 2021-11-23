public void delete() {
    java.util.Set scopeNames = table.keySet();
    java.util.Iterator index = scopeNames.iterator();
    java.lang.String scopeName;
    while (index.hasNext()) {
        scopeName = ((java.lang.String) (index.next()));
        if (lastScopeAdded.equals(scopeName)) {
            table.remove(scopeName);
            break;
        }
    } 
}