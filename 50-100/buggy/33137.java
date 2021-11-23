@java.lang.Override
public void setElder(boolean flag) {
    int i = 4;
    byte existing = getDatawatcher().get(com.dsh105.echopet.compat.nms.v1_9_R1.entity.type.EntityGuardianPet.GUARDIAN_FLAGS_METADATA);
    getDatawatcher().register(com.dsh105.echopet.compat.nms.v1_9_R1.entity.type.EntityGuardianPet.GUARDIAN_FLAGS_METADATA, ((byte) (flag ? existing | i : existing & (~i))));
}