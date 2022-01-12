@java.lang.Override
public boolean shouldAllow(final com.oasisfeng.condom.OutboundType type, @android.support.annotation.Nullable
final android.content.Intent intent, final java.lang.String target_pkg) {
    final java.lang.String settings_pkg = android.support.test.InstrumentationRegistry.getTargetContext().getPackageManager().resolveContentProvider(Settings.System.CONTENT_URI.getAuthority(), 0).packageName;
    return !(settings_pkg.equals(target_pkg));
}