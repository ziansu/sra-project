private void add(java.lang.Object[] patchers) {
    for (java.lang.Object patcher : patchers) {
        if (patcher instanceof org.squiddev.patcher.transformer.IPatcher)
            patches.add(((org.squiddev.patcher.transformer.IPatcher) (patcher)));
        
        if (patcher instanceof org.squiddev.patcher.transformer.ISource)
            patches.add(((org.squiddev.patcher.transformer.ISource) (patcher)));
        
    }
}