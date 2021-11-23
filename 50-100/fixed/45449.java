@java.lang.Override
public void onClick(android.view.View view) {
    disableButtons();
    vars[correctVarsPosition].getBackground().setColorFilter(getResources().getColor(android.R.color.holo_green_dark), PorterDuff.Mode.SRC);
    if (finalI != (correctVarsPosition)) {
        vars[finalI].getBackground().setColorFilter(getResources().getColor(android.R.color.holo_red_dark), PorterDuff.Mode.SRC);
        randomizer.mistake();
    }
    area.setEnabled(true);
    area.setClickable(true);
}