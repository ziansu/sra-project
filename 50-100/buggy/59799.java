@java.lang.Override
public void onInput(com.afollestad.materialdialogs.MaterialDialog materialDialog, java.lang.CharSequence input) {
    db.addSolve(new com.aricneto.twistytimer.items.Solve(0, currentPuzzle, input.toString(), 0L, "", com.aricneto.twistytimer.utils.PuzzleUtils.PENALTY_HIDETIME, "", true));
    historyChecked = false;
    currentPuzzleSubtype = input.toString();
    editor.putString(((com.aricneto.twistytimer.fragment.TimerFragmentMain.KEY_SAVEDSUBTYPE) + (currentPuzzle)), currentPuzzleSubtype);
    editor.apply();
    viewPager.setAdapter(viewPagerAdapter);
    android.widget.Toast.makeText(getContext(), currentPuzzleSubtype, Toast.LENGTH_SHORT).show();
}