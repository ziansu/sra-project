@java.lang.Override
public void onUpdate(@android.support.annotation.Nullable
android.graphics.drawable.Drawable drawable) {
    com.james.status.views.CustomImageView iconView = ((com.james.status.views.CustomImageView) (item.findViewById(R.id.icon)));
    if (drawable != null) {
        item.setVisibility(View.VISIBLE);
        iconView.setVisibility(View.VISIBLE);
        iconView.setImageDrawable(com.james.status.utils.ImageUtils.tintDrawable(drawable, (isDarkMode ? android.graphics.Color.BLACK : android.graphics.Color.WHITE)));
    }else {
        iconView.setVisibility(View.GONE);
        if (!(iconData.hasText()))
            item.setVisibility(View.GONE);
        
    }
}