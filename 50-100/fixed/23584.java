@java.lang.Override
protected void onSuccess(com.blango.cuber.fragment.grid.Palette palette) {
    mPalette = new com.blango.cuber.fragment.grid.MaterialPalette(palette, getResources());
    com.blango.cuber.fragment.grid.F2LFragment.cubes.get(mSectionedAdapter.sectionedPositionToPosition(getPosition())).setPalette(mPalette);
    bg.setBackgroundColor(mPalette.getColor(MaterialPalette.COLOR_PRIMARY));
    title.setTextColor(mPalette.getTextColorForBackground(MaterialPalette.COLOR_PRIMARY));
}