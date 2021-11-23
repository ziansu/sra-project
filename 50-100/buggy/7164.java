public static void putObjectWrapper$$PHOSPHORTAGGED(sun.misc.Unsafe unsafe, java.lang.Object o, int key_tag, long key, java.lang.Object val, java.lang.Class c) {
    if ((val != null) && (!(c.isAssignableFrom(val.getClass())))) {
        val = ((edu.columbia.cs.psl.phosphor.instrumenter.LazyArrayIntTags) (val)).getVal();
    }
    unsafe.putObject(o, key, val);
}