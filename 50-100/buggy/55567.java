public void setId(java.lang.Object id) {
    org.springframework.util.Assert.notNull(id);
    if (id instanceof java.lang.Long) {
        this.id = ((java.lang.Long) (id));
    }else
        if (id instanceof java.lang.Integer) {
            this.id = ((java.lang.Integer) (id)).longValue();
        }
    
    org.junit.Assert.fail();
}