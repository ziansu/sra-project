public static edu.columbia.cs.psl.phosphor.struct.TaintedDoubleWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, double dou, com.swe795.flabug.Change c, edu.columbia.cs.psl.phosphor.struct.TaintedDoubleWithObjTag ret) {
    ret.taint = new edu.columbia.cs.psl.phosphor.runtime.Taint<java.lang.String>(c.toString());
    ret.val = dou;
    return ret;
}