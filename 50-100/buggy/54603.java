@java.lang.Override
protected java.lang.Object createInstanceInModel(java.lang.String type) throws org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException, org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException {
    if (org.json.simple.JSONObject.class.getSimpleName().equals(type)) {
        return new org.json.simple.JSONObject();
    }else
        if (org.json.simple.JSONArray.class.getSimpleName().equals(type)) {
            return new org.json.simple.JSONArray();
        }
    
    throw new org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException(this.getName(), type);
}