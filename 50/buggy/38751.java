@java.lang.Override
public void onDestroy() {
    for (int i = 0; i < (alarmsActivated.size()); i++) {
        alarmsActivated.set(i, false);
    }
    super.onDestroy();
}