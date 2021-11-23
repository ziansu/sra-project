public static com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum convertString(java.lang.String string) {
    if (string == null) {
        return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.none;
    }
    string = string.toLowerCase();
    if (string.equals("irrelevant")) {
        return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.irrelevant;
    }else
        if (string.equals("related")) {
            return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.related;
        }else
            if (string.equals("relevant")) {
                return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.relevant;
            }
        
    
    return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.none;
}