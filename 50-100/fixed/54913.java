private void parseObjectMetadata(com.fasterxml.jackson.core.JsonParser jp) throws java.io.IOException {
    com.fasterxml.jackson.core.JsonToken value;
    while ((jp.nextToken()) != (com.fasterxml.jackson.core.JsonToken.END_OBJECT)) {
        value = jp.nextToken();
        if (value == (com.fasterxml.jackson.core.JsonToken.START_OBJECT)) {
            parseObjectMetadata(jp);
        }else
            if (value == (com.fasterxml.jackson.core.JsonToken.START_ARRAY)) {
                parseArrayMetadata(jp);
            }
        
    } 
}