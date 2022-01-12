public static com.rokuan.calliopecore.sentence.structure.content.INominalObject parseDirectObject(com.rokuan.calliopecore.parser.WordBuffer words) {
    com.rokuan.calliopecore.sentence.structure.content.INominalObject result = null;
    if (words.syntaxStartsWith(com.rokuan.calliopecore.sentence.structure.data.NominalGroupConverter.CUSTOM_OBJECT_PATTERN)) {
        result = com.rokuan.calliopecore.sentence.structure.data.NominalGroupConverter.parseAdditionalObject(words);
    }else
        if (words.syntaxStartsWith(com.rokuan.calliopecore.sentence.structure.data.NominalGroupConverter.PERSON_PATTERN)) {
            result = com.rokuan.calliopecore.sentence.structure.data.NominalGroupConverter.parseAdditionalPerson(words);
        }else
            if (words.syntaxStartsWith(com.rokuan.calliopecore.sentence.structure.data.NominalGroupConverter.DIRECT_OBJECT_PATTERN)) {
                result = com.rokuan.calliopecore.sentence.structure.data.NominalGroupConverter.parseComplementObject(words);
            }
        
    
    return result;
}