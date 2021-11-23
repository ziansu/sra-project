public java.lang.Object[] getPositionalParameters() {
    java.lang.Object[] result = new java.lang.Object[params.size()];
    params.entrySet().forEach(( e) -> {
        result[java.lang.Integer.parseInt(e.getKey())] = e.getValue();
    });
    return result;
}