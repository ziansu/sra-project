@java.lang.Override
public void revalidateBindings() {
    super.revalidateBindings();
    if ((list) != null) {
        list.revalidate();
    }
    if ((array) != null) {
        array.revalidate();
    }
}