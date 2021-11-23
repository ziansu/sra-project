@butterknife.OnClick(value = R.id.re)
public void re() {
    arcs.clear();
    arcs.addAll(mSeekBar.getArcs());
    arcs.remove(((arcs.size()) - 2));
    mSeekBar.clear();
}