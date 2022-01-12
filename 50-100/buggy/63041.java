public void onClick(android.view.View v) {
    if (cameraBtn.isChecked()) {
        android.widget.Toast.makeText(getBaseContext(), "開啟相機", Toast.LENGTH_SHORT).show();
        start_camera();
        surfaceView.setVisibility(View.VISIBLE);
        image.setVisibility(View.GONE);
    }else {
        android.widget.Toast.makeText(getBaseContext(), "關閉相機", Toast.LENGTH_SHORT).show();
        stop_camera();
        surfaceView.setVisibility(View.GONE);
        image.setVisibility(View.VISIBLE);
    }
}