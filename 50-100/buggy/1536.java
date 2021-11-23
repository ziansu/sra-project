public static pokedex.Pokemon randomPokemon(location.Location location) {
    pokedex.Pokemon p = null;
    long name_number = utilities.Utils.generateRandom(0, 100);
    java.lang.System.out.println(name_number);
    java.lang.String name = location.getPokemon(name_number);
    java.lang.System.out.println(name);
    int level_start = location.getMinLevel(name);
    int level_end = location.getMaxLevel(name);
    int level = utilities.Utils.randomLevel(level_start, level_end);
    p = EnumsAndConstants.pokemon_generator.createPokemon(name, level);
    return p;
}