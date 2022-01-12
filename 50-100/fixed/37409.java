@java.lang.Override
protected void controlUpdate(float tpf) {
    mdmw.goldrock.ShootDeerState shootDeerState = app.getStateManager().getState(mdmw.goldrock.ShootDeerState.class);
    if (shootDeerState == null) {
        return ;
    }
    java.lang.String v;
    switch (type) {
        case TOTAL :
            v = "" + (shootDeerState.getTotalKillCount());
            break;
        default :
            v = "";
            break;
    }
    text.setText(v);
}