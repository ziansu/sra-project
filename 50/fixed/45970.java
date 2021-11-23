private int createBundle(int varValueIndex) {
    int bundleIndex = com.rfo.basic.Run.theBundles.size();
    com.rfo.basic.Run.theBundles.add(new android.os.Bundle());
    com.rfo.basic.Run.NumericVarValues.set(varValueIndex, ((double) (bundleIndex)));
    return bundleIndex;
}