public static org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeOperStatus teSubsystem2YangOperStatus(org.onosproject.tetopology.management.api.TeStatus opStatus) {
    switch (opStatus) {
        case DOWN :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeOperStatus.of(TeOperStatusEnum.DOWN);
        case UP :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeOperStatus.of(TeOperStatusEnum.UP);
        case TESTING :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeOperStatus.of(TeOperStatusEnum.TESTING);
        case MAINTENANCE :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeOperStatus.of(TeOperStatusEnum.MAINTENANCE);
        case PREPARING_MAINTENANCE :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeOperStatus.of(TeOperStatusEnum.PREPARING_MAINTENANCE);
        case UNKNOWN :
            return org.onosproject.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.te.types.rev20160705.ietftetypes.TeOperStatus.of(TeOperStatusEnum.UNKNOWN);
        default :
            return null;
    }
}