@java.lang.Override
protected void generalServerPort() {
    cfg.setTargetPort(java.lang.Integer.parseInt(data.getBundle(res.getString(R.string.i2ptunnel_wizard_k_target_port)).getString(Page.SIMPLE_DATA_KEY)));
}