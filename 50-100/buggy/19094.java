public static void addRig(java.lang.String holeId, com.teamshi.collectionsystem3.datastructure.Rig rig) {
    for (com.teamshi.collectionsystem3.datastructure.Hole hole : com.teamshi.collectionsystem3.DataManager.project.getHoleList()) {
        if (hole.getHoleId().equals(holeId)) {
            hole.setEndDate(java.util.Calendar.getInstance());
            java.util.Calendar c = java.util.Calendar.getInstance();
            c.add(java.util.Calendar.DATE, 2);
            hole.setReviewDate(c);
            hole.getRigList().add(rig);
            break;
        }
    }
}