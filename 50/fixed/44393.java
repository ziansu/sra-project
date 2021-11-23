@java.lang.Override
public void add(java.lang.Object object) {
    if (object == null) {
        return ;
    }
    if (object instanceof java.lang.String) {
        addMessage(((java.lang.String) (object)));
    }
}