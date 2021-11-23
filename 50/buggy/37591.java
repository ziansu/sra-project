@java.lang.Override
public STATE getOrConstructResultState(final STATE inputState) {
    final STATE inputRepresentative = mUnionFind.find(inputState);
    if (inputRepresentative == null) {
        return null;
    }
    return mConstructionCache.getOrConstruct(inputRepresentative);
}