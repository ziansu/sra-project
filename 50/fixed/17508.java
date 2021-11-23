@butterknife.OnClick(value = R.id.blueCheckbox)
public void setBlue() {
    if (mTheme.equals("brown")) {
        saveTheme("blue");
        resetTheme();
    }
}