@java.lang.Override
public dorkbox.util.tweenengine.Timeline start() {
    super.start();
    for (int i = 0; i < (children.size()); i++) {
        dorkbox.util.tweenengine.BaseTween<?> obj = children.get(i);
        obj.start();
    }
    return this;
}