private java.lang.String extractKeywords(java.lang.String response) {
    java.lang.String keywords = "";
    if (response.equals(""))
        return response;
    
    try {
        keywords = com.uttesh.exude.ExudeData.getInstance().filterStoppingsKeepDuplicates(response);
    } catch (com.uttesh.exude.exception.InvalidDataException ex) {
        java.lang.System.out.println(("exude failed: " + (ex.getMessage())));
    }
    return keywords;
}