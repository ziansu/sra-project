public static void addCount(MyGame.Example.FlatBufferBuilder builder, int count) {
    builder.addShort(2, ((short) (count)), 0);
}