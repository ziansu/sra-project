@java.lang.Override
public java.lang.Object selectToSave(java.lang.Object... candidates) {
    java.lang.Object selectedCandidate = null;
    if ((candidates != null) && ((candidates.length) > 0)) {
        for (java.lang.Object candidate : candidates) {
            if (candidate instanceof com.hazelcast.nio.serialization.Data) {
                selectedCandidate = candidate;
                break;
            }
        }
        if (selectedCandidate != null) {
            return selectedCandidate;
        }else {
            return candidates[0];
        }
    }
    return selectedCandidate;
}