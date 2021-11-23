public <T> T getByJsonPath(java.lang.String jsonPath) throws org.nybatis.core.exception.unchecked.JsonPathNotFoundException {
    java.lang.Object val;
    if (containsKey(jsonPath)) {
        val = get(jsonPath);
    }else {
        try {
            val = com.jayway.jsonpath.JsonPath.read(this, jsonPath);
        } catch (com.jayway.jsonpath.PathNotFoundException e) {
            throw new org.nybatis.core.exception.unchecked.JsonPathNotFoundException(e.getMessage());
        } catch (java.lang.IllegalArgumentException e) {
            throw new org.nybatis.core.exception.unchecked.JsonPathNotFoundException(e.getMessage());
        }
    }
    return castType(val);
}