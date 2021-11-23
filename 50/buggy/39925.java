public void onFinish() {
    de.lin_engel.robopongcontroller.model.RangeType angle = new de.lin_engel.robopongcontroller.model.RangeType(("" + ((int) ((mLastAngleValue) * 10))));
    mRoboterHelper.sendAngleCommand(angle);
}