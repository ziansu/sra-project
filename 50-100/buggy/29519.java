@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if (org.catrobat.catroid.ProjectManager.getInstance().getComingFromScriptFragmentToSoundFragment()) {
        org.catrobat.catroid.ProjectManager.getInstance().setComingFromScriptFragmentToSoundFragment(false);
        if (!(isAddNewSoundButtonClicked)) {
            getActivity().sendBroadcast(new android.content.Intent(org.catrobat.catroid.ui.ScriptActivity.ACTION_BRICK_LIST_CHANGED));
            org.catrobat.catroid.ui.controller.SoundController.getInstance().switchToScriptFragment(this);
        }
    }
}