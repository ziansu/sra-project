@java.lang.Override
public void validate(final java.lang.Object value) {
    if (isNoOfGroupsOrTargetFilterEmpty()) {
        uiNotification.displayValidationError(i18n.get("message.rollout.noofgroups.or.targetfilter.missing"));
    }else {
        if (value != null) {
            final int groupSize = getGroupSize();
            new com.vaadin.data.validator.IntegerRangeValidator(i18n.get(org.eclipse.hawkbit.ui.rollout.rollout.AddUpdateRolloutWindowLayout.MESSAGE_ROLLOUT_FIELD_VALUE_RANGE, 0, groupSize), 0, groupSize).validate(java.lang.Integer.valueOf(value.toString()));
        }
    }
}