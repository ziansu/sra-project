@java.lang.Override
public void add(int index, T t) {
    if ((list.isEmpty()) || ((list.get(index).getUnixTime()) < (t.getUnixTime()))) {
        if (((index - 1) < 0) || ((list.get((index - 1)).getUnixTime()) > (t.getUnixTime()))) {
            list.add(index, t);
        }
    }
}