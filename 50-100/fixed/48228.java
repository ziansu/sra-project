@java.lang.Override
public boolean contains(java.lang.Object o) {
    for (int i = 0; i < (length); i++) {
        if (o == null) {
            if ((head) == null) {
                return true;
            }
        }else
            if (get(i).equals(o)) {
                return true;
            }
        
    }
    return false;
}