@com.oracle.truffle.api.dsl.Specialization(guards = { "contextLevel != 0" , "isSameEnclosingGroup(receiver, superclassIdx, factory)" }, contains = "doForFurtherOuter")
public final java.lang.Object fixedLookup(final som.vmobjects.SObjectWithClass receiver, @com.oracle.truffle.api.dsl.Cached(value = "getIdx(receiver)")
final int superclassIdx, @com.oracle.truffle.api.dsl.Cached(value = "getEnclosingClass(receiver).getInstanceFactory()")
final som.interpreter.objectstorage.ClassFactory factory) {
    assert factory != null;
    return getEnclosingObject(som.interpreter.nodes.OuterObjectRead.getEnclosingClassWithPotentialFailure(receiver, superclassIdx));
}