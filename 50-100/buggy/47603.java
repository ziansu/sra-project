public int contentCount() {
    int count = 0;
    for (java.lang.reflect.Field f : getClass().getDeclaredFields()) {
        try {
            if (((f.get(this)) != null) && (!(f.isSynthetic()))) {
                count++;
            }
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalAccessException e) {
        }
    }
    return count;
}