public static void setTypo(int p_type, android.widget.Button p_button) {
    p_button.setTypeface(bimedia.c2is.com.com.Typo.getTypoFromType(p_type));
    p_button.getPaint().setAntiAlias(true);
}