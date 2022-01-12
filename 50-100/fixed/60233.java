@java.lang.Override
public void onTaskCompleted() {
    if ((task.object) != null) {
        com.microsoft.windowsazure.mobileservices.MobileServiceList<engineering.prog.memopad.entity.MemoItem> list = ((com.microsoft.windowsazure.mobileservices.MobileServiceList<engineering.prog.memopad.entity.MemoItem>) (task.object));
        if ((list.size()) > 0) {
            for (int i = 0; i < (list.size()); i++) {
                addItem(list.get(i));
            }
            fillList(activity, (next + (list.size())));
        }
    }
}