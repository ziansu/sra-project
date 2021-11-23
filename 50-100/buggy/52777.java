@java.lang.Override
public com.general.arithmetic.linetable.Student ListDelete(int i) {
    i--;
    int location = 0;
    com.general.arithmetic.linetable.Student delete = null;
    if (((singleLink) != null) && ((singleLink.next) != null)) {
        com.general.arithmetic.linetable.Student temp = singleLink;
        while (temp != null) {
            if (location == i) {
                break;
            }else {
                location++;
                temp = temp.next;
            }
        } 
        delete = temp;
        temp.next = temp.next.next;
    }
    return delete;
}