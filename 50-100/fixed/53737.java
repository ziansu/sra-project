@java.lang.Override
public void remove(java.lang.Object element) {
    for (int i = 0; i < (count); i++) {
        if (elements[i].equals(element)) {
            for (int j = i; j < ((count) - 1); j++) {
                elements[j] = elements[(j + 1)];
            }
            (count)--;
            break;
        }
    }
}