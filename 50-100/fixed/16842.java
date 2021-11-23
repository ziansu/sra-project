@java.lang.Override
public void move() {
    (reproduction)--;
    (life)--;
    x += dx;
    y += dy;
    if (!(checkHorizontal(x))) {
        x -= 2 * (dx);
        dx = -(dx);
    }
    if (!(checkVertical(y))) {
        y -= 2 * (dy);
        dy = -(dy);
    }
}