@org.jetbrains.annotations.Nullable
public static jetbrains.mps.smodel.persistence.def.IModelPersistence getPersistence(int version) {
    if (version == 8) {
        return new jetbrains.mps.smodel.persistence.def.v8.ModelPersistence8();
    }
    if (version == 9) {
        return new jetbrains.mps.smodel.persistence.def.v9.ModelPersistence9();
    }
    assert !(jetbrains.mps.smodel.persistence.def.ModelPersistence.isSupported(version)) : "inconsistent ModelPersistence.isSupported and .getPersistence. Version=" + version;
    jetbrains.mps.smodel.persistence.def.ModelPersistence.LOG.error(("Unknown persistence version requested: " + version), new java.lang.Throwable());
    return null;
}