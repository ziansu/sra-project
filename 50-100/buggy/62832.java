private java.util.Map<com.epam.freelancer.business.util.ValidationParametersBuilder.Parameters, java.lang.String> prepareData(java.util.Map<java.lang.String, java.lang.String[]> data) {
    java.util.Map<com.epam.freelancer.business.util.ValidationParametersBuilder.Parameters, java.lang.String> map = new java.util.HashMap<>();
    map.put(com.epam.freelancer.business.util.ValidationParametersBuilder.createParameters(false).minLength(5).maxLength(255), ((data.get("name")) == null ? null : data.get("name")[0]));
    return map;
}