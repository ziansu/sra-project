public autoParker.AutoParkImpl.PositionStatus moveBackward(autoParker.AutoParkImpl.PositionStatus positionStatus) {
    street[((positionStatus.position) - 1)] = isEmpty();
    positionStatus.position -= 1;
    positionStatus.empty = checkIfEmpty(positionStatus.position);
    return positionStatus;
}