@java.lang.Override
public void changeBackground() {
    android.widget.RelativeLayout rl = ((android.widget.RelativeLayout) (this.findViewById(R.id.relLayout_layout)));
    teamfmg.hangman.Settings.setColor(rl);
}