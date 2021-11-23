@org.junit.runners.Parameterized.Parameters
public static java.lang.Object[] data() {
    java.util.HashMap<java.lang.Integer, java.lang.Integer> hm = new java.util.HashMap<>();
    java.util.WeakHashMap<java.lang.Integer, java.lang.Integer> whm = new java.util.WeakHashMap<>();
    java.util.IdentityHashMap<java.lang.Integer, java.lang.Integer> ihm = new java.util.IdentityHashMap<>();
    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> chm = new java.util.concurrent.ConcurrentHashMap<>();
    ihm.clear();
    chm.clear();
    return new java.lang.Object[]{ hm , whm };
}