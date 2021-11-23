@java.lang.Override
public void revalidateBindings() {
    if ((list) != null) {
        list.revalidate();
    }
    if ((array) != null) {
        array.revalidate();
    }
    super.revalidateBindings();
}