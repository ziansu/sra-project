@java.lang.Override
public void applyContainerAttenuation(se.raddo.raddose3D.Container sampleContainer) {
    attenuatedPhotonsPerSec = (photonsPerSec) * (1 - (sampleContainer.getContainerAttenuationFraction()));
}