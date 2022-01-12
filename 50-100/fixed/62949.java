@java.lang.Override
public void onRefresh() {
    if (isConnected) {
        new com.mihai.task.LoadNewsTask(adapter, this, new LoadNewsTask.onFinishListener() {
            @java.lang.Override
            public void afterTaskFinish() {
                refreshLayout.setRefreshing(false);
            }
        }).execute();
    }else {
        com.mihai.utils.Utility.noNetworkAlert(this);
        refreshLayout.setRefreshing(false);
    }
}