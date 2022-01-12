@java.lang.Override
public void propose(java.util.Random random, blang.mcmc.Callback callback) {
    final double oldValue = variable.get();
    callback.setProposalLogRatio(0.0);
    variable.set((oldValue + ((random.nextGaussian()) * (random.nextGaussian()))));
    if (!(callback.sampleAcceptance()))
        variable.set(oldValue);
    
}