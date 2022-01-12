@java.lang.Override
public java.lang.Boolean call(javafx.scene.control.ButtonType buttonType) {
    if (buttonType == (mConfirmButton)) {
        mVrpMaker.buildFiniteSize(mController.getAddedVehicles(), mController.getAddedDepots());
        return true;
    }else
        if (buttonType == (mCancelButton)) {
            java.lang.System.exit(0);
            return false;
        }
    
    return false;
}