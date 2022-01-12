@java.lang.Override
public void add(T t) {
    if ((root) == null) {
        root = new xlp.util.genric.list.Element();
        root.setValue(t);
        root.setPosition(UtilConstant.START_INDEX);
    }else {
        xlp.util.genric.list.Element<T> newElement = new xlp.util.genric.list.Element();
        newElement.setNode(root);
        newElement.setValue(t);
        newElement.setPosition(root.getNextPosition());
        root = newElement;
    }
}