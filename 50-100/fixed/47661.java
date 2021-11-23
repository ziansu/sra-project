java.lang.String paramsForPost(java.lang.String... params) {
    java.lang.StringBuilder mergedParams = new java.lang.StringBuilder("");
    if ((params.length) > 0) {
        mergedParams = new java.lang.StringBuilder(params[0]);
        for (int i = 1; i < (params.length); i++)
            mergedParams.append("&").append(params[i]);
        
    }
    return mergedParams.toString();
}