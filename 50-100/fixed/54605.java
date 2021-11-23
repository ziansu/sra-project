@java.lang.Override
public void onItemDragEnded(int fromPosition, int toPosition) {
    java.util.List<com.datavenia.pathfinderpanacea.widgets.DashboardWidget> itemList = mWidgetAdapter.getItemList();
    if (fromPosition != toPosition) {
        saveWidgetOrder();
    }else {
        com.datavenia.pathfinderpanacea.activities.MainActivity main = ((com.datavenia.pathfinderpanacea.activities.MainActivity) (getActivity()));
        java.lang.String widgetKey = itemList.get(fromPosition).getKey();
        java.lang.Long widgetId = itemList.get(fromPosition).getWidgetId();
        main.startConfigureWidgetActivity(widgetKey, widgetId);
    }
}