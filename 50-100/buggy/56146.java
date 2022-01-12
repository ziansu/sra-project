@java.lang.Override
public void onChanged(dev.blunch.blunch.activity.EventType type) {
    dev.blunch.blunch.domain.CollaborativeMenu menu = service.getAll().get(0);
    if ((menu != null) && ((idMenu) == null)) {
        toolbar.setTitle(("Answers for " + (menu.getName())));
        idMenu = menu.getId();
    }
}