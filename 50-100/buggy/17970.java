private org.json.JSONObject getInfo(java.lang.String personId, java.lang.String keyType) throws com.facepp.error.FaceppParseException {
    org.json.JSONObject personResult = null;
    if (keyType == (KEY_PERSON_ID))
        personResult = httpRequests.personGetInfo(new com.facepp.http.PostParameters().setPersonId(personId));
    else
        if (keyType == (KEY_PERSON_NAME))
            personResult = httpRequests.personGetInfo(new com.facepp.http.PostParameters().setPersonName(personId));
        
    
    kr.ac.kaist.hrhrp.util.Log.log(kr.ac.kaist.hrhrp.type.DEBUG_MODE, personResult.toString());
    return personResult;
}