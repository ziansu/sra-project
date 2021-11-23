@java.lang.Override
public int getPosition(com.yqritc.recyclerviewmultipleviewtypesadapter.DataBinder binder, int binderPosition) {
    E targetViewType = getEnumFromBinder(binder);
    for (int i = 0; i < (getItemCount()); i++) {
        if (targetViewType == (getEnumFromPosition(i))) {
            binderPosition--;
            if (binderPosition <= 0) {
                return i;
            }
        }
    }
    return getItemCount();
}