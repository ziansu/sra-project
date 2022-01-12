public static org.neo4j.graphdb.Node copyReadingProperties(org.neo4j.graphdb.Node oldReading, org.neo4j.graphdb.Node newReading) {
    for (int i = 0; i < 16; i++) {
        java.lang.String key = "dn" + i;
        if (oldReading.hasProperty(key))
            newReading.setProperty(key, oldReading.getProperty(key).toString());
        
    }
    newReading.addLabel(Nodes.WORD);
    return newReading;
}