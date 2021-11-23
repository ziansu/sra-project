@java.lang.Override
public void onOk(yuku.ambilwarna.AmbilWarnaDialog dialog, int color) {
    ((ch.epfl.cs413.palettev01.views.PaletteAdapter) (parent.getAdapter())).setColor(position, color);
    if (!(mPicture.isFileNull())) {
        mPicture.transGrid(palette);
        mPicture.transImage(mView);
    }
}