private void setSwitchOnClickListener(final android.widget.Switch todoSwitch, final fabio.mytodolist.models.beans.Todo todo) {
    todoSwitch.setOnClickListener(new fabio.mytodolist.custom.listeners.TodoSwitchOnClickListener(todo));
}