@java.lang.Override
public void imageProgress(javax.imageio.ImageReader arg0, float arg1) {
    drawProgress(arg1);
    java.lang.System.out.println("loading");
}