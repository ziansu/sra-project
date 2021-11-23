public void run() {
    avscience.ppc.PitObs thepit = getPit(new java.io.File("/Users/mark/desktop/ChinaLake.xml"));
    java.lang.String name = thepit.getName();
    java.lang.System.out.println(("PitName: " + name));
    int bld = thepit.getBuild();
    java.lang.System.out.println(("Build: " + bld));
    java.lang.String ser = thepit.getSerial();
    java.lang.System.out.println(("SERIAL: " + ser));
    java.io.File outfile = new java.io.File("/Users/mark/desktop/OutTest.xml");
    avscience.ppc.XMLWriter writer = new avscience.ppc.XMLWriter();
    writer.writeToXML(pit, outfile);
}