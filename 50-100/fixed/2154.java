@java.lang.Override
public void onGenerated(android.support.v7.graphics.Palette palette) {
    if (palette != null) {
        int backgroundColor = com.stonevire.wallup.utils.ColorModifier.getNonDarkColor(palette, mContext);
        holder.authorLayout.setBackgroundColor(backgroundColor);
        holder.firstName.setTextColor(com.stonevire.wallup.utils.ColorModifier.getBlackOrWhiteInt(backgroundColor, mContext));
        holder.lastName.setTextColor(com.stonevire.wallup.utils.ColorModifier.getBlackOrWhiteInt(backgroundColor, mContext));
    }
}