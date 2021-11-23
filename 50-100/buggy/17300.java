@java.lang.Override
public boolean shouldAllow(final com.oasisfeng.condom.OutboundType type, final java.lang.String target_pkg) {
    final java.lang.String settings_pkg = android.support.test.InstrumentationRegistry.getTargetContext().getPackageManager().resolveContentProvider(Settings.System.CONTENT_URI.getAuthority(), 0).packageName;
    return !(settings_pkg.equals(target_pkg));
}