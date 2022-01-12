@java.lang.Override
public void add(java.lang.String path) {
    if ((listPath.contains(path)) == false) {
        listPath.add(path);
    }else {
        remove(path);
        listPath.add(path);
    }
    eventService.publishLater(new ijfx.core.io.RecentFileAddedEvent().setObject(path));
    save();
}