@java.lang.Override
public void onClick(android.view.View view) {
    savingModelInDb();
    changeStageDetail();
    createView();
    android.support.design.widget.Snackbar.make(findViewById(R.id.header), getBaseContext().getString(com.modelingbrain.home.detailModel.FragmentType.getStringResource()), Snackbar.LENGTH_LONG).setAction("Action", null).show();
}