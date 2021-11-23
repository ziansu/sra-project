@org.eclipse.xtext.validation.Check
public void checkConstraintInputNotService(final org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint constraint) {
    org.fuin.dsl.ddd.domainDrivenDesignDsl.Type _input = constraint.getInput();
    if (_input instanceof org.fuin.dsl.ddd.domainDrivenDesignDsl.Service) {
        this.error("A service is not allowed as input for a constraint", constraint, DomainDrivenDesignDslPackage.Literals.CONSTRAINT__INPUT, org.fuin.dsl.ddd.validation.DomainDrivenDesignDslValidator.SERVICE_NOT_ALLOWED_AS_CONSTRAINT_INPUT);
    }
}