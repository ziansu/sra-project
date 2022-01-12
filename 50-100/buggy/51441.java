private static void AddVampire(int index, generation.Generator gen, boolean Remove) {
    if (Remove) {
        gen.roleList.remove(index);
        gen.roleList.add(index, "Vampire");
    }
    gen.VampPresent = true;
    (gen.TownSize)++;
    (gen.AnySize)++;
    gen.storage.TK.add(gen.storage.TK.size(), "Vampire Hunter");
}