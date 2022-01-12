@java.lang.Override
public void onRefresh() {
    for (int i = 0; i < (tasks.length); i++) {
        if ((tasks[i]) != null) {
            tasks[i].stop();
            tasks[i].cancel(true);
        }
        updateView(i, IDLE);
    }
    init();
    srl_container.setRefreshing(false);
}