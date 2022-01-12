@java.lang.Override
public java.util.HashMap<java.lang.String, java.lang.String> unmarshal(be.nabu.utils.security.resources.KeyStoreManagerConfiguration.AliasPasswordEntry[] arg0) throws java.lang.Exception {
    java.util.HashMap<java.lang.String, java.lang.String> values = new java.util.HashMap<java.lang.String, java.lang.String>();
    for (be.nabu.utils.security.resources.KeyStoreManagerConfiguration.AliasPasswordEntry entry : arg0)
        values.put(entry.getAlias(), entry.getPassword());
    
    return values;
}