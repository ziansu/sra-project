@java.lang.Override
public void onProgressChanged(org.adw.library.widgets.discreteseekbar.DiscreteSeekBar discreteSeekBar, int i, boolean b) {
    player.setTempo(((float) (i)));
}