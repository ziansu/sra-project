@java.lang.Override
protected void handleUpdateState(com.android.systemui.qs.tiles.BooleanState state, java.lang.Object arg) {
    java.lang.String fastChargeState = com.android.systemui.qs.tiles.FileUtils.readOneLine(com.android.systemui.qs.tiles.FastChargeTile.FAST_CHARGE_FILE);
    state.value = (fastChargeState != null) && (fastChargeState.contentEquals("1"));
    state.icon = com.android.systemui.qs.tiles.ResourceIcon.get((state.value ? R.drawable.ic_qs_fastcharge_on : R.drawable.ic_qs_fastcharge_off));
    state.label = mContext.getString((state.value ? R.string.qs_tile_fastcharge : R.string.qs_tile_fastcharge_off));
}