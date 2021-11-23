private void setGoalView() {
    tvGoalPrice.setText(mGoalPrice);
    tvGoalDaysLeft.setText(mGoalDaysLeft);
    tvGoalPoints.setText(mGoalPoints);
    tvGoalName.setText(mGoalName);
    android.graphics.Bitmap goalImage = getGoalImageByGoalSelection();
    ivGoalImage.setImageBitmap(goalImage);
    setUpWheelView();
}