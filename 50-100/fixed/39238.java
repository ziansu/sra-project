private static <T> T[] assertAllSameInstances(T... objects) {
    for (int i = 0; i < ((objects.length) - 1); i++) {
        assertThat(objects[i], org.hamcrest.core.IsSame.sameInstance(objects[(i + 1)]));
    }
    return objects;
}