private com.redhat.ceylon.model.typechecker.model.ProducedType substituteInternal(java.util.Map<com.redhat.ceylon.model.typechecker.model.TypeParameter, com.redhat.ceylon.model.typechecker.model.ProducedType> substitutions, java.util.Map<com.redhat.ceylon.model.typechecker.model.TypeParameter, com.redhat.ceylon.model.typechecker.model.SiteVariance> overrides) {
    if (!(substitutions.isEmpty())) {
        com.redhat.ceylon.model.typechecker.model.ProducedType type = this;
        if (overrides != null) {
            type = com.redhat.ceylon.model.typechecker.model.ProducedType.applyVarianceOverridesInternal(this, true, false, overrides);
        }
        return new com.redhat.ceylon.model.typechecker.model.ProducedType.InternalSubstitution().substitute(type, substitutions, overrides);
    }else {
        return this;
    }
}