private java.lang.String getScreenType(usbong.android.builder.models.details.ImageScreenDetails imageScreenDetails) {
    if (ImagePosition.ABOVE_TEXT.equals(imageScreenDetails.getImagePosition())) {
        if (imageScreenDetails.isHasCaption()) {
            return UsbongScreenType.CLICKABLE_IMAGE_TEXT_DISPLAY.getName();
        }else {
            return UsbongScreenType.IMAGE_TEXT_DISPLAY.getName();
        }
    }else {
        if (imageScreenDetails.isHasCaption()) {
            return UsbongScreenType.TEXT_CLICKABLE_IMAGE_DISPLAY.getName();
        }else {
            return UsbongScreenType.TEXT_IMAGE_DISPLAY.getName();
        }
    }
}