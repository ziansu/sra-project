public <T> T asObject(java.lang.Class<? extends T> cls) {
    try {
        return io.stallion.utils.json.JSON.parse(this.getContent(), cls);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}