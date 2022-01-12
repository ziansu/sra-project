public void shiftIconToScreenSide() {
    if (((params.x) + ((iconWidth) / 2)) <= ((screenWidth) / 2))
        overlayAnimation(0, lockScreenImageView, params.x, ((-(com.android.screenoffwidget.FloatButtonService.delta)) / 2));
    else
        overlayAnimation(0, lockScreenImageView, params.x, (((screenWidth) - (iconWidth)) - ((com.android.screenoffwidget.FloatButtonService.delta) / 2)));
    
}