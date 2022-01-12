@java.lang.Override
public void validate(final java.lang.Object value) {
    if (value != null) {
        new com.vaadin.data.validator.IntegerRangeValidator(i18n.get(org.eclipse.hawkbit.ui.rollout.rollout.AddUpdateRolloutWindowLayout.MESSAGE_ROLLOUT_FIELD_VALUE_RANGE, 0, 100), 0, 100).validate(java.lang.Integer.valueOf(value.toString()));
    }
}