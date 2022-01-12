@java.lang.Override
public void onClick(android.view.View v, at.crud.assistant.models.RecurringAction element) {
    android.content.Intent intent = new android.content.Intent(getActivity(), at.crud.assistant.EventsActivity.class);
    intent.putExtra(EventsActivity.INTENT_EXTRA_RECURRING_ACTION_ID, element.getId());
    getActivity().startActivityForResult(intent, EventsActivity.VIEW_REQUEST_CODE);
}