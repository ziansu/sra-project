public boolean remove(java.lang.Object o) {
    if (o == null) {
        for (int index = 0; index < (size); index++)
            if ((elementData[index]) != null) {
                fastRemove(index);
                return true;
            }
        
    }else {
        for (int index = 0; index < (size); index++)
            if (o.equals(elementData[index])) {
                fastRemove(index);
                return true;
            }
        
    }
    return false;
}