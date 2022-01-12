@java.lang.Override
public void run() {
    android.graphics.Bitmap screen = screenGrabber.grabScreen();
    java.lang.String appraiseText = ocr.getAppraisalText(screen);
    java.lang.String hash = appraiseText.substring(0, appraiseText.indexOf("#"));
    java.lang.String text = appraiseText.substring(((appraiseText.indexOf("#")) + 1));
    addInfoFromAppraiseText(text, hash);
}