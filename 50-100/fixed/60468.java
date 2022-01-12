public java.util.HashMap<java.lang.String, java.lang.Object> getPagingParams(java.lang.Long offset, java.lang.Long batchSize) {
    java.util.HashMap<java.lang.String, java.lang.Object> params = new java.util.HashMap<java.lang.String, java.lang.Object>();
    params.put("offset", offset);
    params.put("batchSize", batchSize);
    return params;
}