@java.lang.Override
public void onItemClick(ninja.amp.ampmenus.events.ItemClickEvent event) {
    for (tk.itstake.steakgui.itemtask.ItemTask task : TASK) {
        try {
            task.runTask(event, MENU);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    MENU.open(event.getPlayer());
}