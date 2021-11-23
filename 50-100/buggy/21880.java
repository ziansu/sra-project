@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T arrayGet(T[] array, int index) {
    return ((T) (com.questdb.misc.Unsafe.getUnsafe().getObject(array, ((com.questdb.misc.Unsafe.OBJ_OFFSET) + (index << (com.questdb.misc.Unsafe.OBJ_SCALE))))));
}