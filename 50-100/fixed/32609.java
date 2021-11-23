@java.lang.Override
public void onResume() {
    loadData();
    loadAnalysis();
    tvName.setText(spUtil.getUsername());
    tvPosition.setText(spUtil.getPosition().getPositionName());
    showProfileImage();
    super.onResume();
}