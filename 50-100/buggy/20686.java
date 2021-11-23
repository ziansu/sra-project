@java.lang.Override
public final void onDraw(javax.microedition.khronos.opengles.GL10 gl, net.henryco.opalette.application.MainActivity context, int width, int height) {
    camera2D.setPosY_absolute(0).update();
    net.henryco.opalette.api.utils.GLESUtils.clear();
    chessBox.render(camera2D);
    if (uCan) {
        for (net.henryco.opalette.application.programs.sub.AppSubProgram<net.henryco.opalette.application.MainActivity> asp : subPrograms) {
            asp.render(gl, context, camera2D, width, height);
        }
    }
    java.lang.System.out.println("DRAW");
}