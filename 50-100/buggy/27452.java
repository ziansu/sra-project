public void shiftIconToScreenSide() {
    if (((params.x) + ((iconWidth) / 2)) <= ((screenWidth) / 2))
        overlayAnimation(false, lockScreenImageView, params.x, ((-(com.android.screenoffwidget.FloatButtonService.delta)) / 2));
    else
        overlayAnimation(false, lockScreenImageView, params.x, (((screenWidth) - (iconWidth)) - ((com.android.screenoffwidget.FloatButtonService.delta) / 2)));
    
}