@java.lang.Override
public int save(T t, int id) {
    data.add(t);
    return data.size();
}