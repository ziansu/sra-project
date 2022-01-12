public static void addPlayer(java.lang.String name) {
    reachForTheTop.IO.createOutputFile((("Scores\\" + name) + ".reach"));
    reachForTheTop.IO.println("times played: 0");
    reachForTheTop.IO.println("total: 0");
    reachForTheTop.IO.closeOutputFile();
    reachForTheTop.IO.createOutputFile("Scores\\names.txt", true);
    reachForTheTop.IO.println(name);
    reachForTheTop.IO.closeOutputFile();
}