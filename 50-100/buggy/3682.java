@java.lang.Override
public void onClick(android.view.View v, at.crud.assistant.models.RecurringAction element) {
    at.crud.assistant.models.RecurringAction recurringAction = element;
    android.content.Intent intent = new android.content.Intent(getActivity(), at.crud.assistant.EventsActivity.class);
    intent.putExtra(EventsActivity.INTENT_EXTRA_RECURRING_ACTION_ID, recurringAction.getId());
    getActivity().startActivityForResult(intent, EventsActivity.VIEW_REQUEST_CODE);
}