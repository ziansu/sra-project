public static edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, int in, com.swe795.flabug.Change c, edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag ret) {
    ret.taint = new edu.columbia.cs.psl.phosphor.runtime.Taint<java.lang.String>(c.toString());
    ret.val = in;
    return ret;
}