@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, diy.uigeneric.sample.SampleEditActivity.class);
    startActivityForResult(intent, diy.uigeneric.sampleserver.SampleServerListActivity.REQUEST_ADD);
}