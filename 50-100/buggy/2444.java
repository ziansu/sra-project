@java.lang.Override
public int clampViewPositionHorizontal(android.view.View child, int left, int dx) {
    if ((dx < 0) && (!(leftAble))) {
        return 0;
    }
    if ((dx > 0) && (!(rightAble))) {
        return 0;
    }
    return left;
}