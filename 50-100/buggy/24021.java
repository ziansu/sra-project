@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    progressBar.setVisibility(View.GONE);
    drawerLayout.setVisibility(View.VISIBLE);
    android.util.Log.d("Debug", "End of parsing");
    android.util.Log.d("Debug", java.lang.String.valueOf(model.getGrandTotalBank()));
    try {
        updateGUI();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}