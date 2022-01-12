public org.animotron.manipulator.QCAVector answered(org.neo4j.graphdb.Relationship createdAnswer, org.animotron.manipulator.QCAVector context) {
    javolution.util.FastList<org.animotron.manipulator.QCAVector> c = javolution.util.FastList.newInstance();
    c.add(context);
    if ((this.context) != null) {
        c.addAll(this.context);
    }
    return new org.animotron.manipulator.QCAVector(question, createdAnswer, c, preceding_sibling);
}