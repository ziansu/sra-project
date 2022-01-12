public static void inject() {
    java.lang.Class<dk.muj.derius.api.DeriusAPI> apiClass = dk.muj.derius.api.DeriusAPI.class;
    java.lang.reflect.Field coreField = com.massivecraft.massivecore.util.ReflectionUtil.getField(apiClass, DeriusConst.API_DERIUS_FIELD);
    if (coreField != null) {
        if (com.massivecraft.massivecore.util.ReflectionUtil.makeAccessible(coreField)) {
            com.massivecraft.massivecore.util.ReflectionUtil.setField(coreField, null, dk.muj.derius.DeriusCore.get());
        }
    }
}