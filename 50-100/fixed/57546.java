private void addParentGroupToTable(final long skillGroupId) {
    us.paskin.mastery.Proto.SkillGroup skillGroup = data.getSkillGroupById(skillGroupId);
    parentGroupList.addTextItem(skillGroup.getName(), new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            android.content.Intent intent = new android.content.Intent(view.getContext(), us.paskin.mastery.SkillGroupDetailActivity.class);
            intent.putExtra(us.paskin.mastery.SkillGroupDetailActivity.ARG_SKILL_GROUP_ID, skillGroupId);
            us.paskin.mastery.SkillGroupDetailActivity.this.startActivity(intent);
        }
    });
}