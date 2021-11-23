private void addParentGroupToTable(final long skillGroupId) {
    us.paskin.mastery.Proto.SkillGroup skillGroup = data.getSkillGroupById(skillGroupId);
    skillGroupList.addTextItem(skillGroup.getName(), new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            android.content.Intent intent = new android.content.Intent(view.getContext(), us.paskin.mastery.SkillGroupDetailActivity.class);
            intent.putExtra(SkillGroupDetailActivity.ARG_SKILL_GROUP_ID, skillGroupId);
            us.paskin.mastery.SkillDetailActivity.this.startActivity(intent);
        }
    }, new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            removeFromSkillGroup(skillGroupId);
        }
    });
}