public static kittens.cats.swhatsappinvaders.Stats getStats(kittens.cats.swhatsappinvaders.util.DoubleVector location, double width, double height) {
    if ((kittens.cats.swhatsappinvaders.Stats.stats) == null) {
        kittens.cats.swhatsappinvaders.Stats.stats = new kittens.cats.swhatsappinvaders.Stats(location, width, height);
    }
    return kittens.cats.swhatsappinvaders.Stats.stats;
}