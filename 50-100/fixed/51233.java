@java.lang.Override
java.lang.String update(java.lang.Object source, ourneighborschild.ONCObject updatedAdult) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String response = null;
    response = serverIF.sendRequest(("POST<update_adult>" + (gson.toJson(updatedAdult, ourneighborschild.ONCAdult.class))));
    if (response.startsWith("UPDATED_ADULT"))
        processUpdatedAdult(source, response.substring(13));
    
    return response;
}