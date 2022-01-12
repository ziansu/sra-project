private void stopedUI() {
    et_receive_from.setEnabled(true);
    et_target.setEnabled(true);
    et_rex.setEnabled(true);
    et_receive_from.setHint(R.string.et_receive_hint);
    et_rex.setHint(R.string.et_rex_hint);
    btn_start.setEnabled(true);
    btn_stop.setEnabled(false);
    rl_rexs.setVisibility(View.VISIBLE);
}