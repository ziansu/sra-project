@java.lang.Override
public boolean shouldAllow(final com.oasisfeng.condom.OutboundType type, @android.support.annotation.Nullable
final android.content.Intent intent, final java.lang.String target_pkg) {
    mNumOutboundJudgeCalled.incrementAndGet();
    return !(com.oasisfeng.condom.CondomContextBlockingTest.DISALLOWED_PACKAGE.equals(target_pkg));
}