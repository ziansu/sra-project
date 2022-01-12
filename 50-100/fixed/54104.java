public void act() {
    if ((life) <= 0) {
        getWorld().removeObject(this);
        if ((getWorld()) == null)
            return ;
        
    }else {
        setLocation(getX(), ((getY()) - 7));
        (life)--;
    }
}