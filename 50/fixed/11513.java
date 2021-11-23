public void bindEvent(edu.umd.cs.jobi.model.Event event) {
    this.event = event;
    dateTextView.setText(event.getDate().toString());
    typeTextView.setText(event.getType().name());
}