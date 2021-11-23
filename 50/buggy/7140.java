@java.lang.Override
public void set(T t) {
    typeConverter.copyFromObject(t, transition.get());
    transition.set(transition.get());
}