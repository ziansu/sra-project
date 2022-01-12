public com.redhat.ceylon.model.typechecker.model.ProducedType substitute(java.util.Map<com.redhat.ceylon.model.typechecker.model.TypeParameter, com.redhat.ceylon.model.typechecker.model.ProducedType> substitutions, java.util.Map<com.redhat.ceylon.model.typechecker.model.TypeParameter, com.redhat.ceylon.model.typechecker.model.SiteVariance> overrides, boolean covariant, boolean contravariant) {
    if (!(substitutions.isEmpty())) {
        com.redhat.ceylon.model.typechecker.model.ProducedType type = this;
        if (overrides != null) {
            type = com.redhat.ceylon.model.typechecker.model.ProducedType.applyVarianceOverridesInternal(this, covariant, contravariant, overrides);
        }
        return new com.redhat.ceylon.model.typechecker.model.ProducedType.Substitution().substitute(type, substitutions, overrides).simple();
    }else {
        return this;
    }
}