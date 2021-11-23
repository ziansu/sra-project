@org.junit.Test
public void testKeySetConfig() {
    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> map = this.createResizedDS();
    java.util.Set<java.lang.Integer> keySet = map.keySet();
    this.parameterized(map, keySet, keySet.toString());
}