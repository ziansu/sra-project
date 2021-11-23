public void convertProjects(java.util.List<org.catrobat.catroid.common.ScratchProgramData> projectList) {
    android.util.Log.i(org.catrobat.catroid.ui.ScratchConverterActivity.TAG, "Converting projects:");
    for (final org.catrobat.catroid.common.ScratchProgramData programData : projectList) {
        conversionManager.convertProgram(programData.getId(), programData.getTitle(), programData.getImage(), false);
    }
    org.catrobat.catroid.utils.ToastUtil.showSuccess(this, R.string.scratch_conversion_started);
}