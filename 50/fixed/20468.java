private static int getUniqueNumber(java.util.Set<java.lang.Integer> existingSet) {
    int candidateID = 0;
    while (existingSet.contains(candidateID)) {
        candidateID++;
    } 
    existingSet.add(candidateID);
    return candidateID;
}