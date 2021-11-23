public java.lang.Object getParameterByKey(java.lang.String name) {
    if ((((getParameters()) != null) && (!(getParameters().isEmpty()))) && (name != null)) {
        for (com.azirar.requester.data.entity.Parameter param : getParameters()) {
            if (param.getKey().toUpperCase().equals(name.toUpperCase())) {
                return param.getValue();
            }
        }
    }
    return null;
}