@java.lang.Override
public void onClick(android.view.View v) {
    finalTableCoordinateTriangles = scaleCoordinates(tempCoordinates);
    android.content.Intent intent = new android.content.Intent(this, com.ghostvr.augmentednav.DisplayActivity.class);
    intent.putExtra("tableCoordinateTriangles", finalTableCoordinateTriangles);
    intent.putExtra("mode", rb_vr_mode.isChecked());
    intent.putExtra("camera_mode", rb_object_centered.isChecked());
    startActivity(intent);
}