public void drawCardsForCroupier(int count) {
    com.company.RandomCardGenerator generator = new com.company.RandomCardGenerator();
    for (int i = 0; i < count; i++) {
        croupier.add(generator.randomCard());
    }
}