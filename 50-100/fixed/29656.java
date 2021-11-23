@java.lang.Override
public int compare(net.sourceforge.ganttproject.GPTreeTableBase.ColumnImpl left, net.sourceforge.ganttproject.GPTreeTableBase.ColumnImpl right) {
    if ((!(left.getStub().isVisible())) || (!(right.getStub().isVisible()))) {
        return left.getName().compareTo(right.getName());
    }
    return (left.getStub().getOrder()) - (right.getStub().getOrder());
}