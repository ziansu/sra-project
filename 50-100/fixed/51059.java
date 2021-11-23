@java.lang.Override
protected void onPostExecute(java.util.List<model.Order> orders) {
    super.onPostExecute(orders);
    try {
        if (this.isVisible()) {
            aggiorna(orders);
        }
    } catch (java.lang.Exception e) {
        if ((!(e instanceof java.lang.NullPointerException)) && ((this.getActivity()) != null)) {
            android.widget.Toast.makeText(getActivity(), "Chiamare Jack", Toast.LENGTH_LONG).show();
        }
    }
}