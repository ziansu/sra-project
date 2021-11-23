@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) == 2) {
        mCamera.moveX2((180 - (mCamera.getAngleX2())));
        mCamera.moveX3((-(mCamera.getAngleX3())));
        setAxisRotation();
        repaint();
        mPrevMouseLocation = null;
    }
}