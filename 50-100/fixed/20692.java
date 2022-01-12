@java.lang.Override
public void updated() {
    if ((list.getSelectedValue()) != null) {
        Model.Room r = h.getRoom(list.getSelectedValue());
        textArea.setText(((((("Room: " + (r.getID())) + "\nFloor: ") + (r.getFloor())) + "\nLayout: ") + (r.getLayout())));
    }
}