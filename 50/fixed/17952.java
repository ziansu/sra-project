public <E extends com.sciamlab.common.model.mdr.EUNamedAuthorityEntry> E getByAlias(java.lang.String alias) {
    return alias == null ? null : ((E) (byAlias.get(alias.toLowerCase().trim())));
}