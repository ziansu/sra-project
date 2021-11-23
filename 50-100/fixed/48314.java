public static org.onosproject.tetopology.management.api.TeStatus yang2TeSubsystemAdminStatus(org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeAdminStatus adminStatus) {
    if (adminStatus == null) {
        return org.onosproject.tetopology.management.api.TeStatus.UNKNOWN;
    }
    switch (adminStatus.enumeration()) {
        case DOWN :
            return org.onosproject.tetopology.management.api.TeStatus.DOWN;
        case UP :
            return org.onosproject.tetopology.management.api.TeStatus.UP;
        case TESTING :
            return org.onosproject.tetopology.management.api.TeStatus.TESTING;
        case MAINTENANCE :
            return org.onosproject.tetopology.management.api.TeStatus.MAINTENANCE;
        case PREPARING_MAINTENANCE :
            return org.onosproject.tetopology.management.api.TeStatus.PREPARING_MAINTENANCE;
        default :
            return org.onosproject.tetopology.management.api.TeStatus.UNKNOWN;
    }
}