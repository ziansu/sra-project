@java.lang.Override
public de.cismet.validation.ValidatorState validate() {
    final de.cismet.validation.ValidatorState state = performValidation();
    setState(state);
    return getState();
}