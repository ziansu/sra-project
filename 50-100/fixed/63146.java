public void planScheduler() {
    if ((selectLocation) != 6) {
        android.widget.Toast.makeText(this, "请选择6个要拜访的地点", Toast.LENGTH_SHORT).show();
        return ;
    }
    btn.setEnabled(false);
    new com.evoupsight.tspclient.CacuTask().execute(chromosomeStr);
    btn.setEnabled(true);
}