@java.lang.Override
public java.lang.String getConfigValueByNamespaceAndKey(java.lang.String namespace, java.lang.String key) {
    if ((namespace == null) || (key == null)) {
        return null;
    }
    if (((repo.containsKey(namespace)) && ((repo.get(namespace)) != null)) && (repo.get(namespace).containsKey(key))) {
        return repo.get(namespace).get(key);
    }
    return null;
}