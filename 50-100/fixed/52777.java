@java.lang.Override
public com.general.arithmetic.linetable.Student ListDelete(int i) {
    i--;
    int location = 0;
    com.general.arithmetic.linetable.Student delete = null;
    if (((singleLink) != null) && ((singleLink.next) != null)) {
        com.general.arithmetic.linetable.Student temp = singleLink.next;
        while (temp != null) {
            location++;
            if (location == i) {
                break;
            }
            temp = temp.next;
        } 
        delete = temp.next;
        temp.next = temp.next.next;
    }
    return delete;
}