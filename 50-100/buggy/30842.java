@java.lang.Override
public int getStartIndex(int str) {
    int index = 0;
    java.lang.Integer start = null;
    while ((start == null) && (index < (alignRes.get(str).size()))) {
        start = alignRes.get(str).get(index);
        index++;
    } 
    return index;
}