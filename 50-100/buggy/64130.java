@java.lang.Override
public void stepSort() {
    if (((data.size()) > 1) && ((i) != (data.size()))) {
        if ((j) == 0) {
            (i)++;
            j = i;
        }
        sort();
    }else {
        paintToParent();
    }
}