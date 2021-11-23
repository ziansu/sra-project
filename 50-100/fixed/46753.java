public boolean isInside(com.dbash.util.Rect r) {
    return ((((x) >= (r.x)) && (((x) + (width)) <= ((r.x) + (r.width)))) && ((y) >= (r.y))) && (((y) + (height)) <= ((r.y) + (r.height)));
}