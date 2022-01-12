@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setData();
    clearProgress.setUnit(java.lang.String.format(context.getResources().getString(R.string.device_avail_memory), ((((com.wiitel.tvhelper.view.ClearFragment.getTotalMemory()) / 1024) / 1024) / 1024)));
    clearExecute.requestFocus();
}