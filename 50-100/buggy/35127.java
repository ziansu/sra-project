public static java.util.List<com.github.entityseeder.EntitySeed> run(final com.github.entityseeder.EntitySeeder<? extends com.github.entityseeder.EntitySeed> seeder, final int n) {
    java.util.List<com.github.entityseeder.EntitySeed> seeds = new java.util.ArrayList<com.github.entityseeder.EntitySeed>();
    for (int i = 0; i <= n; i++)
        seeds.add(seeder.make());
    
    return seeds;
}