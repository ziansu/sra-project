public void setThemeFromPrefs() {
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    switch (sharedPref.getString("theme", "def")) {
        case "def" :
            setTheme(R.style.Cyan);
            return ;
        case "bg" :
            setTheme(R.style.BlueGray);
            return ;
        case "rock" :
            setTheme(R.style.Rock);
            return ;
        case "green" :
            setTheme(R.style.Green);
            return ;
        case "blue" :
            setTheme(R.style.Blue);
            return ;
        case "gray" :
            setTheme(R.style.Gray);
    }
}