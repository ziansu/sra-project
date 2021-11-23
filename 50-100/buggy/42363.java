private static void schedulePrimary(java.util.ArrayList<com.mycompany.app.WriteCal.Technician> techList) {
    int random = ((int) ((java.lang.Math.random()) * (techList.size())));
    com.mycompany.app.WriteCal.Technician tech = techList.get(random);
    if (!(tech.primaryUsed)) {
        tech.primaryUsed = true;
        com.mycompany.app.WriteCal.primary = tech;
        java.lang.System.out.println(("Set primary technician: " + (tech.name)));
        com.mycompany.app.WriteCal.scheduleSecondary(tech, techList);
    }else {
        com.mycompany.app.WriteCal.schedulePrimary(techList);
    }
}