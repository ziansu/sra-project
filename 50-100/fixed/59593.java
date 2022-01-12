public dictionary.APIType getTypeByFullName(java.lang.String name) {
    java.lang.String simpleName = name.substring(((name.lastIndexOf('.')) + 1));
    java.util.HashSet<dictionary.APIType> types = this.getTypesByName(simpleName);
    if (types != null) {
        for (dictionary.APIType type : types) {
            if (type.getFQN().equals(name)) {
                return type;
            }
        }
    }
    return null;
}