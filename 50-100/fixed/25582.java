@org.junit.Before
public void before() {
    moFarah = new com.elderj.pointsiest.Sportsperson("Mo", "Farah", "Mo Farah", 99, 999.999, "mo farah profile pic url");
    peytonManning = new com.elderj.pointsiest.Sportsperson("Peyton", "Manning", "Peyton Manning", 3, 311.113, "peyton manning profile pic url");
    sportspeople.add(moFarah);
    sportspeople.add(peytonManning);
}