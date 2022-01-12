@java.lang.Override
public boolean containsValue(java.lang.Object value) {
    com.company.LastTouchMapImpl.Entry entry = head;
    if ((head) == null) {
        return false;
    }
    do {
        if ((entry.getValue()) == null) {
            if (value == null) {
                return true;
            }
        }else
            if (entry.getValue().equals(value))
                return true;
            
        
        entry = entry.getNext();
    } while (entry != null );
    return false;
}