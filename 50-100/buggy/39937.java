public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.project_picture :
            takePicture();
        case R.id.project_submit :
            boolean complete = validateSubmission();
            if (complete) {
                submitProject();
            }else {
                android.widget.Toast.makeText(getApplicationContext(), R.string.fix_submit, Toast.LENGTH_SHORT).show();
            }
    }
}