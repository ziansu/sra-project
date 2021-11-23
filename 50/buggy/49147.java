private void setColor(java.lang.String colorName) {
    mLabel.setText(colorName);
    if (colorName.equals("primary")) {
        mColor.setCircleColor(R.color.primary);
    }else {
        mColor.setCircleColor(android.graphics.Color.parseColor(colorName));
    }
}