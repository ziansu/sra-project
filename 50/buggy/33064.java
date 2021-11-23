@java.lang.Override
protected java.util.Collection<cc.mallet.types.Instance> balanceHook(cc.mallet.types.InstanceList classInstances, int n) {
    if (n > (classInstances.size()))
        return undersample(classInstances, n);
    else
        return data.balancing.SMOTE.smote(classInstances, n, k);
    
}