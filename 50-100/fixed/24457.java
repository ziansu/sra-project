public static void main(java.lang.String[] args) {
    io.github.kuohsuanlo.cyberworld.CyberWorldBiomeGenerator h = new io.github.kuohsuanlo.cyberworld.CyberWorldBiomeGenerator(3, 3);
    for (int i = -100; i < 25; i++) {
        for (int j = -100; j < 25; j++) {
            int biome_type = h.generateType(i, j, true);
            java.lang.System.out.print(((java.lang.Integer.toHexString(biome_type)) + ","));
        }
        java.lang.System.out.println();
    }
}