public int getBackColor(int life) {
    if (life == 0) {
        return android.graphics.Color.argb(255, 46, 204, 113);
    }
    if (life == 1) {
        return android.graphics.Color.argb(255, 107, 185, 240);
    }
    return android.graphics.Color.argb(255, 231, 76, 60);
}