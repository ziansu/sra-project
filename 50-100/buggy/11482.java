private void parseArrayMetadata(com.fasterxml.jackson.core.JsonParser jp) throws java.io.IOException {
    com.fasterxml.jackson.core.JsonToken value = jp.nextToken();
    while (value != (com.fasterxml.jackson.core.JsonToken.END_ARRAY)) {
        if (value == (com.fasterxml.jackson.core.JsonToken.START_OBJECT)) {
            parseObjectMetadata(jp, true);
        }else
            if (value == (com.fasterxml.jackson.core.JsonToken.START_ARRAY)) {
                parseArrayMetadata(jp);
            }else
                if (value != (com.fasterxml.jackson.core.JsonToken.VALUE_NULL)) {
                    parseObjectMetadata(jp, false);
                }
            
        
        value = jp.nextToken();
    } 
}