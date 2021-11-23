@com.google.appinventor.components.annotations.SimpleFunction(description = "Return the saturation from the given HSV (hue, saturation, value).")
public float Saturation(java.lang.Object hsv) {
    try {
        if (hsv instanceof float[]) {
            float[] array = ((float[]) (hsv));
            if ((array.length) == 3) {
                return array[1];
            }
        }
        form.dispatchErrorOccurredEvent(this, "Saturation", ErrorMessages.ERROR_FTC_INVALID_HSV);
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
        form.dispatchErrorOccurredEvent(this, "Saturation", ErrorMessages.ERROR_FTC_UNEXPECTED_ERROR, e.toString());
    }
    return 0;
}