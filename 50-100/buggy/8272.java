@java.lang.Override
public void updateItem(model.Event event, boolean empty) {
    super.updateItem(event, empty);
    if (event != null) {
        data = new gui.EventCell.EventData();
        data.setEvent(event);
        setGraphic(data.getBox());
    }
}