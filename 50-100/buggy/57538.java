@java.lang.Override
public void add(int index, T t) {
    if ((list.isEmpty()) || ((list.get(index).getUnixTime()) < (t.getUnixTime()))) {
        list.add(index, t);
    }
}