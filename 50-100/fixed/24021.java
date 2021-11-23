@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    progressBar.setVisibility(View.GONE);
    drawerLayout.setVisibility(View.VISIBLE);
    try {
        updateGUI();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}