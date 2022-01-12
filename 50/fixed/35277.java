public void init(com.madara.Variables vars, long id) {
    jni_init(getCPtr(), 1, vars.getCPtr(), id);
    init();
}