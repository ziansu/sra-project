public final boolean mouseInside(vague.module.MouseData m) {
    return !(((((m.getX()) < (this.x)) || ((m.getY()) > (this.y))) || ((m.getX()) < ((this.x) + (this.width)))) || ((m.getY()) > ((this.y) + (this.height))));
}