@javax.annotation.Nullable
@java.lang.Override
public cloud.resources.HardwareInLocation apply(@javax.annotation.Nullable
cloud.HardwareFlavor hardwareFlavor) {
    com.google.common.base.Preconditions.checkNotNull(hardwareFlavor);
    java.lang.String location = de.uniulm.omi.cloudiator.sword.core.util.IdScopeByLocations.from(hardwareFlavor.id()).getLocationId();
    return new cloud.resources.HardwareInLocation(hardwareFlavor, cloudId, cloudCredential, location);
}