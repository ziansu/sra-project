final void terminalValidation() throws dfh.cli.ValidationException {
    if ((value()) != null) {
        for (dfh.cli.ValidationRule<K> v : validationRules) {
            v.test(value());
        }
    }
}