@java.lang.Override
public boolean isAvailable() {
    if (isDisabled)
        return false;
    
    if (!(resourceSets.isEmpty())) {
        boolean duplicates = false;
        for (int i : resourceSets.values()) {
            if (i > 1) {
                duplicates = true;
            }
        }
        if (duplicates) {
            return checkAvailabilityWithDuplicateSets();
        }
    }else {
        for (de.uni.freiburg.iig.telematik.sepia.petrinet.timedNet.concepts.IResource r : resources) {
            if (!(r.isAvailable())) {
                return false;
            }
        }
    }
    return true;
}