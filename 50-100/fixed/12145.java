public void toHint() {
    mTracker.send(new com.google.android.gms.analytics.HitBuilders.EventBuilder().setCategory("Action").setAction("MoveToHint").setLabel(com.sweets.rumandapp.StageMainBottomFragment.SCREEN_NAME).build());
    android.content.Intent intent = new android.content.Intent(getActivity(), com.sweets.rumandapp.StageHintActivity.class);
    intent.putExtra(Const.STAGE_ID_KEY, stageId);
    startActivity(intent);
}