@java.lang.Override
public <T> com.schedjoules.eventdiscovery.framework.serialization.core.FluentBuilder<android.os.Bundle> with(com.schedjoules.eventdiscovery.framework.serialization.core.Key<T> key, com.schedjoules.eventdiscovery.framework.serialization.core.Box<T> box) {
    android.os.Bundle bundle = new android.os.Bundle(mBundle);
    bundle.putParcelable(key.name(), box);
    return new com.schedjoules.eventdiscovery.framework.serialization.commons.BundleBuilder(mBundle, null);
}