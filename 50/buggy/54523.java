@java.lang.Override
public void onReceiveNotification(java.util.ArrayList<br.edu.ifce.swappers.swappers.model.Notification> notifications) {
    this.dataSource.addAll(notifications);
    this.adapter.notifyDataSetChanged();
}