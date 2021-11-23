@java.lang.Override
public void collidedWith(robokill.Element element) {
    if (element instanceof robokill.Player) {
        this.damage(100, false);
        ((robokill.Player) (element)).damage(20, false);
    }
}