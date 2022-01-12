private void changeBackgroundColor(int selectedColor) {
    HeadColor = selectedColor;
    initTheme();
    if ((mainFragment) != null)
        mainFragment.setTheme();
    
}