@java.lang.Override
@android.support.annotation.CallSuper
public void unbind() {
    com.example.nikolay.alarm.screen.disable.disable_swipe.view.DisableSwipeActivity target = this.target;
    if (target == null)
        throw new java.lang.IllegalStateException("Bindings already cleared.");
    
    this.target = null;
    target.tvTime = null;
    target.tvInfo = null;
    view2131558548.setOnTouchListener(null);
    view2131558548 = null;
}