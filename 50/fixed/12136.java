@java.lang.Override
public void run() {
    try {
        if ((bmp) != null)
            bmp = android.graphics.BitmapFactory.decodeStream(urlimage.openConnection().getInputStream());
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}