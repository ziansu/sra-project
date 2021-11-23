@org.junit.Test
public void testKeySetConfig() {
    java.util.Map<java.lang.Integer, java.lang.Integer> map = createResizedDS();
    java.util.Set<java.lang.Integer> keySet = map.keySet();
    this.parameterized(map, keySet, keySet.toString());
}