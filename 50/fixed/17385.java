public static void updateViewWithCameraMaskValue(android.widget.ImageView view, com.omikronsoft.whatsthatcolor.component.CameraMask cameraMask, int value) {
    if (cameraMask != null) {
        view.setImageBitmap(cameraMask.getMaskBitmap(value));
        com.omikronsoft.whatsthatcolor.utility.ViewUtility.viewLastUpdate.put(view, org.joda.time.DateTime.now());
    }
}