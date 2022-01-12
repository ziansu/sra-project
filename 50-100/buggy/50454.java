@java.lang.Override
public com.example.jickay.top6.TaskRecyclerAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int i) {
    android.widget.RelativeLayout card = ((android.widget.RelativeLayout) (android.view.LayoutInflater.from(context).inflate(R.layout.task_card, parent, false)));
    this.parent = parent;
    mainActivity = new com.example.jickay.top6.MainActivity();
    widgetManager = android.appwidget.AppWidgetManager.getInstance(context);
    return new com.example.jickay.top6.TaskRecyclerAdapter.ViewHolder(card);
}