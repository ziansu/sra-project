@java.lang.Override
public void tick(uk.co.nickthecoder.itchy.Actor actor) {
    for (java.util.Iterator<uk.co.nickthecoder.itchy.animation.Animation> i = this.compoundAnimation.children.iterator(); i.hasNext();) {
        uk.co.nickthecoder.itchy.animation.Animation child = i.next();
        child.tick(actor);
        if (child.isFinished()) {
            i.remove();
        }
    }
}