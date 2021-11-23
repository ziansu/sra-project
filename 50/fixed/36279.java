private com.mediamath.terminalone.models.TPASCreativeUpload parseTPASCreativeUploadData(java.lang.String response, com.mediamath.terminalone.utils.T1JsonToObjParser parser) {
    com.mediamath.terminalone.models.TPASCreativeUpload finalResponse;
    finalResponse = parser.parse3PasCreativeUploadResponseTOObj(response);
    return finalResponse;
}