public io.bloco.cardcase.data.models.Card build() {
    io.bloco.cardcase.data.models.Card card = new io.bloco.cardcase.data.models.Card();
    card.setId(java.util.UUID.randomUUID());
    card.setName(faker.name.name());
    card.setEmail(faker.internet.email(card.getName()));
    card.setPhone(faker.phoneNumber.phoneNumber());
    card.setCreatedAt(faker.time.backward(365));
    card.setUpdatedAt(card.getCreatedAt());
    return card;
}