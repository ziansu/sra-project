public static com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum convertString(java.lang.String string) {
    if (string == null) {
        return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.none;
    }else
        if (string.equals(com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.irrelevant.toString())) {
            return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.irrelevant;
        }else
            if (string.equals(com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.related.toString())) {
                return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.related;
            }else
                if (string.equals(com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.relevant.toString())) {
                    return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.relevant;
                }
            
        
    
    return com.silicolife.textmining.core.interfaces.core.document.relevance.RelevanceTypeEnum.none;
}