private gov.nist.hit.core.domain.Constraints createAdditionalConstraint(java.lang.String path) throws java.io.IOException {
    gov.nist.hit.core.domain.Constraints constraint = additionalConstraints(path);
    gov.nist.hit.core.domain.Constraints existing = this.constraintsRepository.findOneBySourceId(constraint.getSourceId());
    if (existing != null) {
        constraint.setId(existing.getId());
    }
    return constraint;
}