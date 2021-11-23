private com.redhat.ceylon.model.typechecker.model.ProducedType substituteInternal(java.util.Map<com.redhat.ceylon.model.typechecker.model.TypeParameter, com.redhat.ceylon.model.typechecker.model.ProducedType> substitutions, java.util.Map<com.redhat.ceylon.model.typechecker.model.TypeParameter, com.redhat.ceylon.model.typechecker.model.SiteVariance> overrides) {
    if (!(substitutions.isEmpty())) {
        return new com.redhat.ceylon.model.typechecker.model.ProducedType.InternalSubstitution().substitute(this, substitutions, overrides, true, false);
    }else {
        return this;
    }
}