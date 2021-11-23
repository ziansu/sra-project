@java.lang.Override
public planet.surface.AtmoCell generateCell(int x, int y) {
    planet.surface.AtmoCell gen = new planet.surface.AtmoCell(x, y);
    gen.add(planet.surface.Layer.BASALT, 10000, true);
    return gen;
}