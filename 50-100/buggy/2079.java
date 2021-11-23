public java.lang.Boolean getMappingNeighbour(java.lang.Long srcId, java.lang.Long destId) {
    for (int i = 0; i < (neighboursOfAllVetexesAsTupleArray[java.lang.Integer.parseInt(srcId.toString())]._2().length); i++) {
        if ((((java.lang.Number) (neighboursOfAllVetexesAsTupleArray[1]._2()[i]._1())).longValue()) == destId) {
            return true;
        }
    }
    return false;
}