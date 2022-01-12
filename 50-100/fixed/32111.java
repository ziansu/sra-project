public static <I extends org.openur.module.domain.userstructure.UserStructureBase, P extends org.openur.module.persistence.rdbms.entity.PUserStructureBase> boolean immutableEqualsToEntityUserStructureBase(I immutable, P persistable) {
    if (!(org.openur.module.persistence.mapper.rdbms.AbstractEntityMapperTest.immutableEqualsToEntityIdentifiable(immutable, persistable))) {
        return false;
    }
    return (immutable.getStatus()) == (persistable.getStatus());
}