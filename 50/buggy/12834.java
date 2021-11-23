public static edu.columbia.cs.psl.phosphor.struct.TaintedShortWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, short sho, com.swe795.flabug.Change c, edu.columbia.cs.psl.phosphor.struct.TaintedShortWithObjTag ret) {
    ret.taint = new edu.columbia.cs.psl.phosphor.runtime.Taint<java.lang.String>(c.toString());
    ret.val = sho;
    return ret;
}