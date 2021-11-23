@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_settings :
            {
                android.content.Intent intent = new android.content.Intent(this, unmannedairlines.dronepan.SettingsActivity.class);
                intent.putExtra("modelName", getModelName());
                startActivity(intent);
                break;
            }
        case R.id.panoButton :
            {
                startPano();
                break;
            }
        default :
            break;
    }
}