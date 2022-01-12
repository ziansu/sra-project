@java.lang.Override
public void ListInsert(int i, com.general.arithmetic.linetable.Student student) {
    int location = 1;
    if ((singleLink) != null) {
        com.general.arithmetic.linetable.Student previous = singleLink.next;
        while (location != i) {
            if ((previous != null) && ((previous.next) != null)) {
                previous = previous.next;
            }
            location++;
        } 
        if (previous != null) {
            com.general.arithmetic.linetable.Student next = previous.next;
            previous.next = student;
            student.next = next;
        }else {
            singleLink.next = student;
            student.next = null;
        }
    }
}