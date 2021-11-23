public static com.realrules.game.demo.CoordinateSystem get() {
    if ((com.realrules.game.demo.CoordinateSystem.instance) == null) {
        return new com.realrules.game.demo.CoordinateSystem();
    }
    return com.realrules.game.demo.CoordinateSystem.instance;
}