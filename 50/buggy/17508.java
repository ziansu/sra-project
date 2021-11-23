@butterknife.OnClick(value = R.id.blueCheckbox)
public void setBlue() {
    if (mTheme.equals("brown")) {
        blueTheme();
        saveTheme("blue");
        resetTheme();
    }
}