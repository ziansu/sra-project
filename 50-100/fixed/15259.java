private java.lang.String getName(java.lang.String name) {
    if (hasGroup(name)) {
        return name.substring(((name.indexOf(backend.resource.TurboLabel.getDelimiter(name).get())) + 1));
    }else {
        return name;
    }
}