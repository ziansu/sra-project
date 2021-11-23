@java.lang.Override
public int getPosition(com.yqritc.recyclerviewmultipleviewtypesadapter.DataBinder binder, int binderPosition) {
    int viewType = mBinderList.indexOf(binder);
    if (viewType < 0) {
        throw new java.lang.IllegalStateException("binder does not exist in adapter");
    }
    int position = binderPosition;
    for (com.yqritc.recyclerviewmultipleviewtypesadapter.DataBinder dataBinder : mBinderList) {
        position += dataBinder.getItemCount();
    }
    return position;
}