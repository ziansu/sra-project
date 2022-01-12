private void resolveStoragePartitions(org.apache.lens.cube.parse.CubeQueryContext cubeql) throws org.apache.lens.server.api.error.LensException {
    java.util.Iterator<org.apache.lens.cube.parse.Candidate> candidateIterator = cubeql.getCandidates().iterator();
    while (candidateIterator.hasNext()) {
        org.apache.lens.cube.parse.Candidate candidate = candidateIterator.next();
        boolean isComplete = true;
        for (org.apache.lens.cube.parse.TimeRange range : cubeql.getTimeRanges()) {
            isComplete &= candidate.evaluateCompleteness(range, range, failOnPartialData);
        }
        if (!isComplete) {
            candidateIterator.remove();
        }
    } 
}