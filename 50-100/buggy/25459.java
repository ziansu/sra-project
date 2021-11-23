@java.lang.Override
public void init() {
    planetName = "Earth";
    orbitIndex = 3;
    size = 4;
    Color = new com.callumcarmicheal.solar.maths.Vector3f(0.0F, 0.0F, 1.0F);
    subplanets.add(new com.callumcarmicheal.solar.objects.Planet("Earth (Moon)", 3, 0, 0, new com.callumcarmicheal.solar.maths.Vector3f(1.0F, 1.0F, 1.0F), this, null, 4));
    dayMultiplier = 1;
    subplanets_Multiplier = 4;
    subplanets_offset = 0.7F;
}