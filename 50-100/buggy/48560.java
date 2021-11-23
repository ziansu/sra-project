private void ack(com.ctrip.hermes.storage.range.NewOffsetBitmap bitmap, int start, int end, com.ctrip.hermes.storage.message.Ack ack) {
    java.util.List<java.lang.Long> list = new java.util.ArrayList<>();
    for (int i = start; i < end; i++) {
        list.add(((long) (i)));
    }
    bitmap.ackOffset(list, ack);
}