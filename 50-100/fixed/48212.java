protected void customQueryCheck(java.lang.String field) {
    try {
        java.lang.Boolean b = _fieldManager.checkSupportForCustomQuery(field);
        if ((b != null) && b) {
            throw new java.lang.RuntimeException((((("Field [" + field) + "] is type [") + (_fieldManager.getFieldTypeDefinition(field))) + "] queries should exist with \" around them."));
        }
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}