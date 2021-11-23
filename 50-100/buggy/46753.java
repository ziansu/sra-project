public boolean isInside(com.dbash.util.Rect r) {
    return ((((x) >= (r.x)) && ((width) <= (r.width))) && ((y) >= (r.y))) && ((height) <= (r.height));
}