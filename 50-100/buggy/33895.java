@java.lang.Override
public boolean areObjectsEqual(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match statsMatch, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match storedMatch) {
    if ((storedMatch.getVlanMatch()) == null) {
        if ((statsMatch.getVlanMatch()) != null) {
            return false;
        }
    }else
        if (!(storedMatch.getVlanMatch().equals(statsMatch.getVlanMatch()))) {
            return false;
        }
    
    return true;
}