private boolean matchesInitHorVelocityHorVelocityMaxHorVelocity(double initHorVelocity, double horVelocity, double maxHorVelocity) {
    return (horVelocity == 0) || ((horVelocity >= initHorVelocity) && (horVelocity <= maxHorVelocity));
}