public static void init(android.app.Activity act) {
    com.ryangame.pet.jni.Helper.mCanvas = new android.graphics.Canvas();
    com.ryangame.pet.jni.Helper.mPaint = new android.graphics.Paint();
    com.ryangame.pet.jni.Helper.mActivity = act;
}