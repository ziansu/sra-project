public org.bimserver.interfaces.STypeDefinition convertToSObject(org.bimserver.interfaces.TypeDefinition input) {
    if (input == null) {
        return null;
    }
    if (input instanceof org.bimserver.interfaces.ArrayDefinition) {
        return convertToSObject(((org.bimserver.interfaces.ArrayDefinition) (input)));
    }else
        if (input instanceof org.bimserver.interfaces.PrimitiveDefinition) {
            return convertToSObject(((org.bimserver.interfaces.PrimitiveDefinition) (input)));
        }else
            if (input instanceof org.bimserver.interfaces.ObjectDefinition) {
                return convertToSObject(((org.bimserver.interfaces.ObjectDefinition) (input)));
            }
        
    
    org.bimserver.interfaces.STypeDefinition result = new org.bimserver.interfaces.STypeDefinition();
    return result;
}