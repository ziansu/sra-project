@java.lang.Override
public T peek() {
    if (this.isEmpty()) {
        return null;
    }else {
        return this.get(0);
    }
}