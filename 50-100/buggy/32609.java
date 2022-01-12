@java.lang.Override
public void onResume() {
    super.onResume();
    loadData();
    loadAnalysis();
    tvName.setText(spUtil.getUsername());
    tvPosition.setText(spUtil.getPosition().getPositionName());
    showProfileImage();
}