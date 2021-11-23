final void terminalValidation() throws dfh.cli.ValidationException {
    for (dfh.cli.ValidationRule<K> v : validationRules) {
        v.test(value());
    }
}