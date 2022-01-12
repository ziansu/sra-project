public static com.realrules.game.demo.CoordinateSystem get() {
    if ((com.realrules.game.demo.CoordinateSystem.instance) == null) {
        com.realrules.game.demo.CoordinateSystem.instance = new com.realrules.game.demo.CoordinateSystem();
    }
    return com.realrules.game.demo.CoordinateSystem.instance;
}