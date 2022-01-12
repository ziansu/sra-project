public static <T, S extends ru.noties.spg.SPGSerializer<T, ?>> S getSerializer(java.lang.Class<T> c) {
    final java.util.Map map = ru.noties.spg.SPGManager.getInstance().mSerializers;
    return ((S) (map.get(c)));
}