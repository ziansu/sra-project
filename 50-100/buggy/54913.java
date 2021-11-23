private void parseObjectMetadata(com.fasterxml.jackson.core.JsonParser jp, boolean notNull) throws java.io.IOException {
    if (notNull) {
        com.fasterxml.jackson.core.JsonToken value;
        while ((jp.nextToken()) != (com.fasterxml.jackson.core.JsonToken.END_OBJECT)) {
            value = jp.nextToken();
            if (value == (com.fasterxml.jackson.core.JsonToken.START_OBJECT)) {
                parseObjectMetadata(jp, true);
            }else
                if (value == (com.fasterxml.jackson.core.JsonToken.START_ARRAY)) {
                    parseArrayMetadata(jp);
                }else
                    if (value == (com.fasterxml.jackson.core.JsonToken.VALUE_NULL)) {
                        parseObjectMetadata(jp, true);
                    }
                
            
        } 
    }
}