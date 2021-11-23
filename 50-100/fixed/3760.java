@java.lang.Override
public void onLoadFinished(java.util.ArrayList<com.vadim.hasdfa.udacity.baking_app.Model.Recipe> recipes) {
    if ((recipes.isEmpty()) || ((recipes.size()) == 0)) {
        android.widget.Toast.makeText(this, "Load data error!", Toast.LENGTH_LONG).show();
    }else {
        mAdapter.notifyDataSetChanged(recipes);
    }
}