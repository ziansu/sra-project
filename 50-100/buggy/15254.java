public void transform(long timestamp) {
    super.store("current", timestamp, getOriginVal("current"), 1L);
    super.store("max", timestamp, getOriginVal("max"), 1L);
    super.store("incre4gc", timestamp, getDeltaVal("incre4gc"), 0L);
    super.store("decre4gc", timestamp, getDeltaVal("decre4gc"), 0L);
    super.store("decre4survivor", timestamp, getDeltaVal("decre4survivor"), 0L);
    super.commit();
}