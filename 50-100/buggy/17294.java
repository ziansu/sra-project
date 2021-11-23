public java.lang.Object[] getPositionalParameters() {
    java.lang.Object[] result = new java.lang.Object[params.size()];
    params.entrySet().forEach(( e) -> {
        result[((int) (e.getKey()))] = e.getValue();
    });
    return result;
}