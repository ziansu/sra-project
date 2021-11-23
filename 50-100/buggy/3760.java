@java.lang.Override
public void onLoadFinished(java.util.ArrayList<com.vadim.hasdfa.udacity.baking_app.Model.Recipe> recipes) {
    if ((recipes.isEmpty()) || ((recipes.size()) == 0)) {
        android.widget.Toast.makeText(this, "Load data error!", Toast.LENGTH_LONG).show();
    }else {
        mAdapter.notifyDataSetChanged(recipes);
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(this);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(this, com.vadim.hasdfa.udacity.baking_app.Widget.RecipeViewWidget.class));
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, R.id.widget_gridview);
    }
}