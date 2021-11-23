public void setUserCoordinateSystem(int userCoordinateSystem) {
    if ((userCoordinateSystem < (com.example.damianmichalak.bluetooth_test.view.widget.JoystickView.COORDINATE_CARTESIAN)) || ((movementConstraint) > (com.example.damianmichalak.bluetooth_test.view.widget.JoystickView.COORDINATE_DIFFERENTIAL)))
        android.util.Log.e(TAG, "invalid value for userCoordinateSystem");
    else
        this.userCoordinateSystem = userCoordinateSystem;
    
}