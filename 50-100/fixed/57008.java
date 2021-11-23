public static org.onosproject.tetopology.management.api.TeStatus yang2TeSubsystemOpStatus(org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeOperStatus opStatus) {
    if (opStatus == null) {
        return null;
    }
    switch (opStatus.enumeration()) {
        case DOWN :
            return org.onosproject.tetopology.management.api.TeStatus.DOWN;
        case UP :
            return org.onosproject.tetopology.management.api.TeStatus.UP;
        case MAINTENANCE :
            return org.onosproject.tetopology.management.api.TeStatus.MAINTENANCE;
        case PREPARING_MAINTENANCE :
            return org.onosproject.tetopology.management.api.TeStatus.PREPARING_MAINTENANCE;
        case TESTING :
            return org.onosproject.tetopology.management.api.TeStatus.TESTING;
        case UNKNOWN :
            return org.onosproject.tetopology.management.api.TeStatus.UNKNOWN;
        default :
            return null;
    }
}