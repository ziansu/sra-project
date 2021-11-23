private void settleHeader() {
    if (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) && ((currentHeader.getTag()) != null)) {
        currentHeader.setTag(null);
        currentHeader.animate().z(0);
    }
}