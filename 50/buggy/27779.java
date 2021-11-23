private void initLauncherChildren(android.view.View launcher) {
    icList = ((android.support.v7.widget.RecyclerView) (launcher.findViewById(R.id.ic_list)));
    trigger = ((android.widget.ImageView) (launcher.findViewById(R.id.touch_trigger)));
    initIconList();
    initTrigger();
}