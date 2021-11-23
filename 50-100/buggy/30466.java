public void register(org.apache.ibatis.scripting.LanguageDriver instance) {
    if (instance == null) {
        throw new java.lang.IllegalArgumentException("null is not a valid Language Driver");
    }
    org.apache.ibatis.scripting.LanguageDriver driver = LANGUAGE_DRIVER_MAP.get(instance.getClass());
    if (driver == null) {
        LANGUAGE_DRIVER_MAP.put(instance.getClass(), driver);
    }
}