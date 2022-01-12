@javax.annotation.Nullable
@java.lang.Override
public cloud.resources.HardwareInLocation apply(@javax.annotation.Nullable
cloud.HardwareFlavor hardwareFlavor) {
    com.google.common.base.Preconditions.checkNotNull(hardwareFlavor);
    return new cloud.resources.HardwareInLocation(hardwareFlavor, cloudId, cloudCredential);
}