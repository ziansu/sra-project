public ch.heigvd.gamification.models.Badge save(ch.heigvd.gamification.models.Badge badge, ch.heigvd.gamification.models.Registration registration) throws ch.heigvd.gamification.api.exceptions.ConflictException {
    if (exists(badge.getName(), registration)) {
        throw new ch.heigvd.gamification.api.exceptions.ConflictException();
    }
    badge.setRegistration(registration);
    return badgeRepository.save(badge);
}