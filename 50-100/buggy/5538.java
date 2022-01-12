@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    android.util.Log.d("testitest", "dismiss");
    if (org.catrobat.catroid.ProjectManager.getInstance().getCommingFromScriptFragmentToSoundFragment()) {
        org.catrobat.catroid.ProjectManager.getInstance().setCommingFromScriptFragmentToSoundFragment(false);
        getActivity().sendBroadcast(new android.content.Intent(org.catrobat.catroid.ui.ScriptActivity.ACTION_BRICK_LIST_CHANGED));
        isResultHandled = true;
        org.catrobat.catroid.ui.controller.SoundController.getInstance().switchToScriptFragment(this);
    }
}