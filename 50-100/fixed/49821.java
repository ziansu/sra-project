public static <S extends ru.noties.spg.SPGSerializer<?, ?>> S getSerializer(java.lang.Class<S> c) {
    final java.util.Map map = ru.noties.spg.SPGManager.getInstance().mSerializers;
    return ((S) (map.get(c)));
}