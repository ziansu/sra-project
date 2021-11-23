public org.animotron.manipulator.QCAVector question(org.neo4j.graphdb.Relationship q) {
    if ((((question) != null) && (question.equals(q))) && ((answer) == null))
        return this;
    
    return new org.animotron.manipulator.QCAVector(q, this);
}