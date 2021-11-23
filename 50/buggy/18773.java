public com.github.javiersantos.bottomdialogs.BottomDialog.Builder setNegativeText(@android.support.annotation.StringRes
int buttonTextRes) {
    setPositiveText(this.context.getString(buttonTextRes));
    return this;
}