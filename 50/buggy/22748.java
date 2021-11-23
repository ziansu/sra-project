@java.lang.Override
public void synced(final org.jdesktop.beansbinding.Binding binding) {
    setState(new de.cismet.validation.ValidatorStateImpl(ValidatorState.Type.VALID));
}