@java.lang.Override
public boolean containsValue(java.lang.Object value) {
    com.company.LastTouchMapImpl.Entry entry = head;
    while ((entry.getNext()) != null) {
        if (entry.getValue().equals(value))
            return true;
        
        entry = entry.getNext();
    } 
    return false;
}