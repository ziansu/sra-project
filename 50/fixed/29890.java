@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    dsHexSection = new org.digitalillusion.droid.iching.utils.sql.HexSectionDataSource(getApplicationContext());
    current = new org.digitalillusion.droid.iching.IChingActivityRenderer.CurrentState();
}