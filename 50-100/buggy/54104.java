public void act() {
    if ((life) <= 0) {
        getWorld().removeObject(this);
    }else {
        setLocation(getX(), ((getY()) - 7));
        (life)--;
    }
}