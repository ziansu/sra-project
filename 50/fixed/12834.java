public static edu.columbia.cs.psl.phosphor.struct.TaintedShortWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, short sho, edu.columbia.cs.psl.phosphor.struct.TaintedShortWithObjTag ret) {
    ret.taint = tag;
    ret.val = sho;
    return ret;
}