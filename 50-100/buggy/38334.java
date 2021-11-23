protected void selectDefaultCandidate() {
    synchronized(localCandidates) {
        java.util.Iterator<org.ice4j.ice.LocalCandidate> localCandsIter = localCandidates.iterator();
        while (localCandsIter.hasNext()) {
            org.ice4j.ice.LocalCandidate cand = localCandsIter.next();
            if ((this.defaultCandidate) == null) {
                this.defaultCandidate = cand;
                continue;
            }
            if ((defaultCandidate.getDefaultPreference()) < (cand.getDefaultPreference())) {
                defaultCandidate = cand;
            }
        } 
    }
}