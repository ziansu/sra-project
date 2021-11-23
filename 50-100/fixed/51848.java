private void setTextViewSelected() {
    if (selectedDefault) {
        setTextColor(selectedColor);
        if (null != (selectedIcon)) {
            selectedIcon.setColorFilter(iconSelectedColorFilter, PorterDuff.Mode.SRC_ATOP);
            setCompoundDrawablesWithIntrinsicBounds(null, selectedIcon, null, null);
        }
    }else {
        setTextColor(unselectedColor);
        if (null != (unselectedIcon)) {
            unselectedIcon.setColorFilter(iconUnSelectedColorFilter, PorterDuff.Mode.SRC_ATOP);
            setCompoundDrawablesWithIntrinsicBounds(null, unselectedIcon, null, null);
        }
    }
}