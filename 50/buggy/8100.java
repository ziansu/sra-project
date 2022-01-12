@java.lang.Override
public void onClick(android.view.View v) {
    doodleView.setPenColor(tempColor);
    doodleView.setPenWidth(tempProgress);
    com.smartdraw.dijay.Activity.SketchpadActivity.currentPenColor = tempColor;
    com.smartdraw.dijay.Activity.SketchpadActivity.currentPenWidth = tempProgress;
    selectDialog.dismiss();
}