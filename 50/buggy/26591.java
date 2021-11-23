@java.lang.Override
@javax.annotation.Nonnull
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE", justification = "We always require nonnull channel when we initialize this launcher")
public hudson.remoting.VirtualChannel getChannel() {
    hudson.remoting.VirtualChannel vc = super.getChannel();
    if (vc == null) {
        new java.lang.IllegalStateException("RemoteLauncher has been initialized with Null channel. It should not happen");
    }
    return super.getChannel();
}