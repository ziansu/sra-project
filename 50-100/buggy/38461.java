@java.lang.Override
public void onDismissed(android.support.design.widget.Snackbar snackbar, int event) {
    if (isRealyDelete) {
        com.marocks.todo.api.ApiUtil.jsonRequest(this, (((com.marocks.todo.api.ApiUtil.todos) + "/") + (itemToDelete.getId())), new org.json.JSONObject(), Request.Method.DELETE);
        android.support.design.widget.Snackbar snackbar1 = android.support.design.widget.Snackbar.make(coordinatorLayout, ("TODO is deleted !" + (isRealyDelete)), Snackbar.LENGTH_SHORT);
        snackbar1.show();
    }
}