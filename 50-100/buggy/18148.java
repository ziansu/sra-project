@java.lang.Override
public boolean areObjectsEqual(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match statsMatch, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match storedMatch) {
    if ((storedMatch.getLayer3Match()) == null) {
        if ((statsMatch.getLayer3Match()) != null) {
            return false;
        }
    }else
        if (!(org.opendaylight.openflowplugin.applications.statistics.manager.impl.helper.MatchComparatorHelper.layer3MatchEquals(statsMatch.getLayer3Match(), storedMatch.getLayer3Match()))) {
            return false;
        }
    
    return true;
}