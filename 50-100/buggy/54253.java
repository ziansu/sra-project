@java.lang.Override
public boolean onTouchDragged(final com.jfixby.r3.api.ui.unit.input.TouchDraggedEvent input_event) {
    if (!(this.pressed)) {
        return false;
    }
    this.touchCurrent.set(input_event.getCanvasPosition());
    final double TOUCH_MAX_DELTA = (((this.blueWidth) / 8) * 0) + 0;
    com.jfixby.cmns.api.log.L.d(this.blueWidth);
    if ((this.touchCurrent.distanceTo(this.touchBegin)) >= TOUCH_MAX_DELTA) {
        this.clickBlue();
    }
    return true;
}