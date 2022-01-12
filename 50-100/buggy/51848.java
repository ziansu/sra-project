private void setTextViewSelected() {
    if (selectedDefault) {
        setTextColor(selectedColor);
        selectedIcon.setColorFilter(iconSelectedColorFilter, PorterDuff.Mode.SRC_ATOP);
        setCompoundDrawablesWithIntrinsicBounds(null, selectedIcon, null, null);
    }else {
        setTextColor(unselectedColor);
        unselectedIcon.setColorFilter(iconUnSelectedColorFilter, PorterDuff.Mode.SRC_ATOP);
        setCompoundDrawablesWithIntrinsicBounds(null, unselectedIcon, null, null);
    }
}