public org.animotron.manipulator.QCAVector answered(org.neo4j.graphdb.Relationship createdAnswer, org.animotron.manipulator.QCAVector context) {
    javolution.util.FastList<org.animotron.manipulator.QCAVector> c = new javolution.util.FastList<org.animotron.manipulator.QCAVector>();
    c.add(context);
    if ((this.context) != null) {
        c.addAll(this.context);
    }
    return new org.animotron.manipulator.QCAVector(question, createdAnswer, c, preceding_sibling);
}