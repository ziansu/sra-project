private boolean isNormalObject(java.lang.Object o) {
    return (((!(o.getClass().isArray())) && (!(o instanceof java.util.Collection))) && (!(o instanceof java.util.Map))) && (!(o instanceof java.util.Vector));
}