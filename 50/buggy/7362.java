@java.lang.Override
public boolean onReadUnready() {
    _history.add("unready");
    return super.onReadUnready();
}