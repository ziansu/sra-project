@java.lang.Override
public void onSuccess() {
    if (poster != null) {
        android.support.v7.graphics.Palette.generateAsync(com.nasahapps.awkwardratings.Utils.getImageViewBitmap(poster), new android.support.v7.graphics.Palette.PaletteAsyncListener() {
            @java.lang.Override
            public void onGenerated(android.support.v7.graphics.Palette p) {
                int color = p.getDarkMutedColor(p.getMutedColor(p.getDarkVibrantColor(-16777216)));
                com.nasahapps.awkwardratings.Utils.animateToColor(background, color);
            }
        });
    }
}