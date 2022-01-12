public boolean isExactly(com.redhat.ceylon.model.typechecker.model.ProducedType type) {
    return resolveAliases().isExactlyInternal(type.resolveAliases());
}