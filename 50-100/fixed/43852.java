@java.lang.Override
public int getCount() {
    int count = ((paths) == null) ? 1 : (paths.size()) + 1;
    if (count > (maxImages)) {
        return paths.size();
    }else {
        return count;
    }
}