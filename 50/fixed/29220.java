void nextDestination() {
    do {
        destination = com.google.common.base.Optional.of(roadModel.get().getRandomPosition(rng));
    } while (destination.get().equals(getPosition()) );
}