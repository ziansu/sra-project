public boolean tick(creatures.Creature target) {
    if ((duration) == 0) {
        return true;
    }
    act(target);
    if ((duration) > 0) {
        (duration)--;
        if ((duration) == 0) {
            end(target);
            return true;
        }
    }
    return false;
}