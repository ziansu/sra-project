@java.lang.Override
public int get(int position) {
    assert set.get(position);
    return position + (offset);
}