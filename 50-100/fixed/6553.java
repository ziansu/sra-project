@java.lang.Override
protected void generalServerHttpBidirOrStreamr(boolean isStreamr) {
    cfg.setReachableBy(data.getBundle(res.getString(R.string.i2ptunnel_wizard_k_reachable_on)).getString(Page.SIMPLE_DATA_KEY));
    if (!isStreamr)
        cfg.setPort(java.lang.Integer.parseInt(data.getBundle(res.getString(R.string.i2ptunnel_wizard_k_binding_port)).getString(Page.SIMPLE_DATA_KEY)));
    
}