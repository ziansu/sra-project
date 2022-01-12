@org.junit.Before
public void before() {
    com.elderj.pointsiest.Sportsperson moFarah = new com.elderj.pointsiest.Sportsperson("Mo", "Farah", "Mo Farah", 99, 999.999, "mo farah profile pic url");
    com.elderj.pointsiest.Sportsperson peytonManning = new com.elderj.pointsiest.Sportsperson("Peyton", "Manning", "Peyton Manning", 3, 311.113, "peyton manning profile pic url");
    java.util.ArrayList<com.elderj.pointsiest.Sportsperson> sportspeople = new java.util.ArrayList<>();
    sportspeople.add(moFarah);
    sportspeople.add(peytonManning);
}