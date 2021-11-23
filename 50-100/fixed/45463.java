@java.lang.Override
public void onCollisionWith(org.group17.Units.GameObject other) {
    if (other instanceof org.group17.Units.Bubble) {
        this.bInBubble = true;
    }else {
        this.getSpeed().setX((-(this.getSpeed().getX())));
        if ((other instanceof org.group17.Units.Player) && (bInBubble)) {
            this.getMap().remove(this);
        }
    }
}