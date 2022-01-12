public com.redhat.ceylon.model.typechecker.model.ProducedType substitute(java.util.Map<com.redhat.ceylon.model.typechecker.model.TypeParameter, com.redhat.ceylon.model.typechecker.model.ProducedType> substitutions, java.util.Map<com.redhat.ceylon.model.typechecker.model.TypeParameter, com.redhat.ceylon.model.typechecker.model.SiteVariance> overrides) {
    if (!(substitutions.isEmpty())) {
        return new com.redhat.ceylon.model.typechecker.model.ProducedType.Substitution().substitute(this, substitutions, overrides, true, false).simple();
    }else {
        return this;
    }
}