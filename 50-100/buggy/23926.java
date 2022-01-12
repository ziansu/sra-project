@butterknife.OnClick(value = R.id.add_item)
public void addItem(android.view.View view) {
    java.lang.String newName = newNameInput.getText().toString().trim();
    newNameInput.setText("");
    if (newName.isEmpty()) {
        com.randomappsinc.studentpicker.Misc.Utils.showSnackbar(parent, getString(R.string.blank_name));
    }else {
        adapter.addName(newName);
        com.randomappsinc.studentpicker.Models.EditListEvent event = new com.randomappsinc.studentpicker.Models.EditListEvent();
        event.setEventType(EditListEvent.ADD);
        event.setName(newName);
        de.greenrobot.event.EventBus.getDefault().post(event);
    }
}