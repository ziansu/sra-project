static void statistics(int i) {
    com.company.Main.infectedList.add(java.lang.Integer.toString(com.company.Main.nInfected));
    com.company.Main.imuneList.add(java.lang.Integer.toString(com.company.Main.nImune));
    com.company.Main.bothList.add(java.lang.Integer.toString(((com.company.Main.nInfected) - (com.company.Main.nImune))));
    com.company.Main.neverInfectedList.add(java.lang.Integer.toString(((com.company.Main.nAgents) - (com.company.Main.nInfected))));
    com.company.Main.exposedList.add(java.lang.Integer.toString(com.company.Main.nExposed));
}