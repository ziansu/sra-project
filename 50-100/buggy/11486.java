@java.lang.Override
public void onDismiss(com.example.reativos.oscar.AddParam myDialogFragment) {
    java.lang.String command_type = dataStore.getString("type");
    int command_param = dataStore.getInt("param");
    if (command_type != null) {
        com.example.reativos.oscar.Command newCommand = new com.example.reativos.oscar.Command(command_type, command_param);
        commandLists.get(currentTabTag).add(newCommand);
        adapters.get(currentTabTag).notifyDataSetChanged();
    }
}