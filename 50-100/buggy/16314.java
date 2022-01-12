public void loadOfficial(java.util.ArrayList<java.lang.String> newOfficials) {
    try {
        this.officials.add(new Ozlympic.Officials(newOfficials.get(0), newOfficials.get(2), java.lang.Integer.valueOf(newOfficials.get(3)), newOfficials.get(4)));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Loading official data is error!");
    }
}