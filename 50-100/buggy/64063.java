@java.lang.Override
public int compare(de.uniko.sebschlicht.graphity.neo4j.model.UserProxy u1, de.uniko.sebschlicht.graphity.neo4j.model.UserProxy u2) {
    long i1 = java.lang.Long.valueOf(u1.getIdentifier());
    long i2 = java.lang.Long.valueOf(u2.getIdentifier());
    if (i1 < i2) {
        return 1;
    }else
        if (i1 > i2) {
            return -1;
        }else {
            return 0;
        }
    
}