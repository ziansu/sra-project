public me.grantammons.banhammer.core.entities.Entity nextEntity() {
    if (((current) != null) && ((repeat.indexOf(current)) != (-1))) {
        queue.add(current, current.speed);
    }
    current = queue.get();
    duration = current.speed;
    return current;
}