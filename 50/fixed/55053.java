@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    this.ispriv = false;
    android.util.Log.d(com.wx.imx53server.MyCamera.TAG, "surface destoryed,release resource");
}