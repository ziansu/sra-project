@java.lang.Override
public void showEventInfo(com.wow.wowmeet.models.Event event) {
    this.event = event;
    txtPlace.setText(event.getLocation().getName());
    txtType.setText(event.getType().getName());
    txtDateTime.setText(event.getCreatedAt());
    txtUsername.setText(event.getCreator().getName());
}