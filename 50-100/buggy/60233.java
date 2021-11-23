@java.lang.Override
public void onTaskCompleted() {
    if ((task.object) != null) {
        com.microsoft.windowsazure.mobileservices.MobileServiceList<engineering.prog.memopad.entity.MemoItem> list = ((com.microsoft.windowsazure.mobileservices.MobileServiceList<engineering.prog.memopad.entity.MemoItem>) (task.object));
        if ((list.size()) > 0) {
            addItem(list.get(0));
            fillList(activity, (next + 1));
        }
    }
}