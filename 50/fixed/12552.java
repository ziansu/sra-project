@java.lang.Override
public void tick() {
    x += nx;
    y += ny;
    (life)--;
    if ((life) <= 0) {
        remove();
    }
}