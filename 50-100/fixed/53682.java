@java.lang.Override
public void dispatchDraw(@org.jetbrains.annotations.NotNull
android.graphics.Canvas canvas) {
    if ((pullView) != null) {
        canvas.save();
        canvas.translate(0, ((pullProgress) - (pullView.getMeasuredHeight())));
        super.dispatchDraw(canvas);
        canvas.restore();
    }else {
        super.dispatchDraw(canvas);
    }
}