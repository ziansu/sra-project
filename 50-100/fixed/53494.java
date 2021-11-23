@org.junit.Before
public void setUp() throws java.lang.Exception {
    qualifications = new java.util.HashSet<cs414.a1.rbetten.Qualification>();
    qualifications.add(new cs414.a1.rbetten.Qualification("Program"));
    qualifications.add(new cs414.a1.rbetten.Qualification("Plan"));
    qualifications.add(new cs414.a1.rbetten.Qualification("Testing"));
    wWill = new cs414.a1.rbetten.Worker("Will", qualifications);
    wTina = new cs414.a1.rbetten.Worker("Tina", qualifications);
    wTina.setSalary(10000);
    wNoah = new cs414.a1.rbetten.Worker("Noah", qualifications);
}