@java.lang.Override
public void update(internetofeveryone.ioe.Data.DataType type) {
    if (type.equals(DataType.WEBSITE)) {
        if (isViewAttached()) {
            getView().dataChanged();
        }else {
        }
    }
}