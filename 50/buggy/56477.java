@java.lang.Override
public boolean isNullAt(int ordinal) {
    return data.getIsNull(((offset) + ordinal));
}