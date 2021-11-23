@java.lang.Override
public void replaceItemIn(com.nextpoorslob.basictasklist.model.TaskItem item, java.util.List<com.nextpoorslob.basictasklist.model.TaskItem> items) {
    int pos = items.indexOf(item);
    if (pos < 0) {
        if ((item.getId()) < 0) {
            item.setId(getNextAutonumber());
            items.add(item);
        }
    }else {
        items.add(pos, item);
        items.remove((pos + 1));
    }
}