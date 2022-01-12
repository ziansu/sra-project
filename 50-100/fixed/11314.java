public void deselectController() {
    if ((mCursorController) != null) {
        mCursorController.removePickEventListener(mPickHandler);
        mCursorController.setEnable(false);
        mCursorController = null;
    }
    if ((mControllerModel) != null) {
        mControllerModel.setEnable(false);
        mControllerModel = null;
    }
}