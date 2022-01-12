@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    mRecyclerViewAdapter.deleteSelectedItems(type, this);
    if (type == (Dialog.PRESETS)) {
        displaySpinner(mSpinnerPreset, presetStringArray());
    }else {
        mTimeLimitArray = io.github.sdsstudios.ScoreKeeper.TimeLimit.getTimeLimitArray(this);
        displaySpinner(mSpinnerTimeLimit, timeLimitStringArray());
    }
}