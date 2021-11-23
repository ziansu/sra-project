private int find(de.lmu.ifi.dbs.elki.database.ids.DBID element) {
    int componentNumber = getElementIndex(element);
    return find(componentNumber);
}