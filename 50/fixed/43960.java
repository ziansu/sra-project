public double getSecondsPerShot(java.util.Collection<lisong_mechlab.model.modifiers.Modifier> aModifiers) {
    return (getCoolDown(aModifiers)) + ((volleyDelay) * ((roundsPerShot) - 1));
}