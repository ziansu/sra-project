private void setSlaveMode() {
    mVariableLayout.setVisibility(View.GONE);
    com.vgomc.mchelper.entity.setting.Configuration.getInstance().variableManager.clear(mRS485Channel.subject);
    com.vgomc.mchelper.entity.setting.Configuration.getInstance().variableManager.clear(Channel.SUBJECT_SDI);
    mVariableListView.removeAllVariable();
}