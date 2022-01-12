@java.lang.Override
public dorkbox.util.tweenengine.Timeline start() {
    super.start();
    int size = children.size();
    for (int i = 0; i < size; i++) {
        dorkbox.util.tweenengine.BaseTween<?> obj = children.get(i);
        obj.start();
    }
    return this;
}