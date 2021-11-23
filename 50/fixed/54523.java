@java.lang.Override
public void onReceiveNotification(java.util.ArrayList<br.edu.ifce.swappers.swappers.model.Notification> notifications) {
    if (notifications != null) {
        this.dataSource.addAll(notifications);
        this.adapter.notifyDataSetChanged();
    }
}