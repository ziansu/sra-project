@org.junit.Test
public void testEntrySetParametrized() {
    java.util.Map<java.lang.Integer, java.lang.Integer> map = createResizedDS();
    java.util.Set<java.util.Map.Entry<java.lang.Integer, java.lang.Integer>> entrySet = map.entrySet();
    java.lang.String str = entrySet.toString();
    parameterized(map, entrySet, str);
}