public static edu.columbia.cs.psl.phosphor.struct.TaintedLongWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, long lon, com.swe795.flabug.Change c, edu.columbia.cs.psl.phosphor.struct.TaintedLongWithObjTag ret) {
    ret.taint = new edu.columbia.cs.psl.phosphor.runtime.Taint<java.lang.String>(c.toString());
    ret.val = lon;
    return ret;
}