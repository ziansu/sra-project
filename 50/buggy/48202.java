@java.lang.Override
public int count(java.lang.Object element) {
    if (data.containsKey(element.hashCode())) {
        return data.get(element.hashCode()).size();
    }else {
        return 0;
    }
}