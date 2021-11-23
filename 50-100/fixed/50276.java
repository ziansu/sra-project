public static org.mycore.datamodel.metadata.history.MCRMetadataHistoryEventType fromAbbr(char abbr) {
    switch (abbr) {
        case 'c' :
            return org.mycore.datamodel.metadata.history.MCRMetadataHistoryEventType.Create;
        case 'd' :
            return org.mycore.datamodel.metadata.history.MCRMetadataHistoryEventType.Delete;
        default :
            throw new java.lang.IllegalArgumentException(((("No such " + (org.mycore.datamodel.metadata.history.MCRMetadataHistoryEventType.class.getSimpleName())) + ": ") + abbr));
    }
}