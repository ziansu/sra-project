public static org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeAdminStatus teSubsystem2YangAdminStatus(org.onosproject.tetopology.management.api.TeStatus adminStatus) {
    switch (adminStatus) {
        case DOWN :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeAdminStatus.of(TeAdminStatusEnum.DOWN);
        case UP :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeAdminStatus.of(TeAdminStatusEnum.UP);
        case TESTING :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeAdminStatus.of(TeAdminStatusEnum.TESTING);
        case MAINTENANCE :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeAdminStatus.of(TeAdminStatusEnum.MAINTENANCE);
        case PREPARING_MAINTENANCE :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeAdminStatus.of(TeAdminStatusEnum.PREPARING_MAINTENANCE);
        case UNKNOWN :
            return null;
        default :
            return null;
    }
}