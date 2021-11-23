@java.lang.Override
public void set(T v) {
    if (!(isDone())) {
        super.set(v);
    }
}