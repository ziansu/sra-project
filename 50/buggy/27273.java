protected void onResume() {
    super.onResume();
    if (com.enayet.minigma.multiscreen.need_compat) {
        setPassword();
    }
}