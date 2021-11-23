static java.lang.String getGenericSymbol(sysml.SystemModel.ModelItem itemType) {
    switch (itemType) {
        case CONTEXT :
        case IDENTIFIER :
        case NAME :
        case OBJECT :
        case PROPERTY :
        case RELATIONSHIP :
        case TYPE :
        case VERSION :
        case WORKSPACE :
            return itemType.toString().substring(0, 1);
        case CONSTRAINT :
            return "CT";
        case VALUE :
            return "U";
        case VIEW :
            return "O";
        case VIEWPOINT :
            return "O";
        default :
            gov.nasa.jpl.mbee.util.Debug.error(("Unexpected ModelItem: " + itemType));
    }
    return null;
}