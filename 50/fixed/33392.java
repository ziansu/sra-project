public com.google.common.base.Optional<net.thucydides.core.requirements.model.Requirement> getParentRequirementOf(final net.thucydides.core.model.TestOutcome testOutcome) {
    return firstRequirementFoundIn(parentRequirementFromPackagePath(testOutcome), requirementWithMatchingPath(testOutcome), featureTagRequirementIn(testOutcome), mostSpecificTagRequirementFor(testOutcome));
}