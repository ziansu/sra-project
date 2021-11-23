@java.lang.Override
public int getStartIndex(int str) {
    int index = -1;
    java.lang.Integer start = null;
    while ((start == null) && (index < (alignRes.get(str).size()))) {
        index++;
        start = alignRes.get(str).get(index);
    } 
    return index;
}