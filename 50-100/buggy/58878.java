public void setImageDrawable(android.graphics.drawable.Drawable img, com.example.obswitchcompat.ObSwitchCompatTab.ImagePosition imagePosition) {
    switch (imagePosition) {
        case LEFT :
            setCompoundDrawablesWithIntrinsicBounds(img, null, null, null);
            break;
        case TOP :
            setCompoundDrawablesWithIntrinsicBounds(null, img, null, null);
            break;
        case RIGHT :
            setCompoundDrawablesWithIntrinsicBounds(null, null, img, null);
            break;
        case BOTTOM :
            setCompoundDrawablesWithIntrinsicBounds(null, null, null, img);
            break;
    }
    invalidate();
}