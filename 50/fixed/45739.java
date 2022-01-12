public static edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, boolean boo, edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag ret) {
    ret.taint = tag;
    ret.val = boo;
    return ret;
}