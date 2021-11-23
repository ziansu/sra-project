private static boolean withinBoundsInDirectionOfTravel(android.graphics.Rect bounds, float vx, float vy) {
    switch (com.artifex.mupdfdemo.ReaderView.directionOfTravel(vx, vy)) {
        case com.artifex.mupdfdemo.ReaderView.MOVING_DIAGONALLY :
            return bounds.contains(0, 0);
        case com.artifex.mupdfdemo.ReaderView.MOVING_LEFT :
            return (bounds.left) <= 0;
        case com.artifex.mupdfdemo.ReaderView.MOVING_RIGHT :
            return (bounds.right) >= 0;
        case com.artifex.mupdfdemo.ReaderView.MOVING_UP :
            return (bounds.top) <= 0;
        case com.artifex.mupdfdemo.ReaderView.MOVING_DOWN :
            return (bounds.bottom) >= 0;
        default :
            return false;
    }
}