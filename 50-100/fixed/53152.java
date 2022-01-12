public org.animotron.manipulator.QCAVector question2(org.neo4j.graphdb.Relationship q) {
    if ((((question) != null) && (question.equals(q))) && ((answer) == null))
        return this;
    
    if ((answer) == null) {
        org.animotron.manipulator.QCAVector v = new org.animotron.manipulator.QCAVector(q, context);
        return v;
    }
    return new org.animotron.manipulator.QCAVector(q, this);
}