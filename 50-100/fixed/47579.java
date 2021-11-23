@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    rotateAngel += 3;
    invalidate();
    matrix.reset();
    matrix.preRotate(rotateAngel, 0, 0);
    handler.sendEmptyMessageDelayed(com.example.cw.practice.practice.shader.RadarView.MSG_WHAT, com.example.cw.practice.practice.shader.RadarView.POST_DELAY);
}