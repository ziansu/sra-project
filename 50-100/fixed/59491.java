@java.lang.Override
public void onClick(android.view.View v) {
    int size = getAllLeadDataUpload();
    if (size > 0) {
        new com.narnolia.app.HomeActivity.UploadLeadData().execute();
    }else {
        android.widget.Toast.makeText(this, "No data for uploading lead..", Toast.LENGTH_SHORT).show();
    }
}