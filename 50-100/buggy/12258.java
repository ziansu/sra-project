@java.lang.Override
public void add(T t) {
    if ((root) == null) {
        root.setValue(t);
        root.setPosition(UtilConstant.START_INDEX);
    }else {
        xlp.util.genric.list.Element<T> newElement = new xlp.util.genric.list.Element();
        newElement.setNode(root);
        newElement.setPosition(root.getNextPosition());
        root = newElement;
    }
}