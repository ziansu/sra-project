@java.lang.Override
public void onError() {
    mPalette = new com.blango.cuber.fragment.grid.MaterialPalette(null, getResources());
    if (((getPosition()) > (-1)) && ((getPosition()) < (com.blango.cuber.fragment.grid.F2LFragment.cubes.size()))) {
        com.blango.cuber.fragment.grid.F2LFragment.cubes.get(mSectionedAdapter.sectionedPositionToPosition(getPosition())).setPalette(mPalette);
    }
    bg.setBackgroundColor(mPalette.getColor(MaterialPalette.COLOR_PRIMARY));
    title.setTextColor(mPalette.getTextColorForBackground(MaterialPalette.COLOR_PRIMARY));
}