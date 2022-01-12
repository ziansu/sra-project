@org.junit.Test
public void testEntrySetParameterized() {
    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> map = this.createResizedDS();
    java.util.Set<java.util.Map.Entry<java.lang.Integer, java.lang.Integer>> entrySet = map.entrySet();
    java.lang.String str = entrySet.toString();
    this.parameterized(map, entrySet, str);
}