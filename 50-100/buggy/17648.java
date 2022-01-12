public java.lang.Boolean lateAdditionKiePluginPresent(java.lang.Boolean present) {
    if (((kiePluginPresent) == null) && (present != null)) {
        this.kiePluginPresent = present;
        return java.lang.Boolean.TRUE;
    }
    if (present != null) {
        kiePluginPresent = present;
        return java.lang.Boolean.TRUE;
    }
    return java.lang.Boolean.FALSE;
}