public <E extends com.sciamlab.common.model.mdr.EUNamedAuthorityEntry> E getByAlias(java.lang.String alias) {
    return ((E) (byAlias.get(alias.toLowerCase().trim())));
}