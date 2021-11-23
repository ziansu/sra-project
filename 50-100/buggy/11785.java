@java.lang.Override
public void remove(java.lang.Object object) {
    if ((internalList) == null)
        return ;
    
    for (int ic = 0; ic < (internalList.size()); ic++) {
        if (internalList.get(ic).getReturnValue().equals(object)) {
            internalList.remove(ic);
        }
    }
}