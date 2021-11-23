@java.lang.Override
public void onGenerated(android.support.v7.graphics.Palette palette) {
    plus.mcpe.mcpe_plus.widget.CardView cardView = ((plus.mcpe.mcpe_plus.widget.CardView) (itemView));
    int start = ((titleView.getHeight()) + (imageView.getHeight())) - 1;
    cardView.setCardBackgroundShader(new android.graphics.LinearGradient(0, start, 0, (start + 1), palette.getLightVibrantColor(palette.getLightMutedColor(Color.WHITE)), palette.getDarkVibrantColor(palette.getDarkMutedColor(Color.BLACK)), Shader.TileMode.CLAMP));
}