@javafx.fxml.FXML
public void initialize() {
    desc.setText(task.getDesc().getValue());
    id.setText(((displayedIndex) + ". "));
    venue.setText(task.getVenue().value);
    priority.setText(task.getPriority().getValue());
    time.setText(task.getTime().getValue());
    tags.setText(task.tagsString());
}