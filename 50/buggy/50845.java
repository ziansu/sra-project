public void guardarUsuarioLogueado(java.lang.Integer idUsuario) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    prefs.edit().putInt(getString(R.string.pref_sesion_inic), idUsuario).apply();
}