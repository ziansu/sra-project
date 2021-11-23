@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    koofService = org.bosik.diacomp.android.backend.common.Storage.getKoofService(getContentResolver());
}