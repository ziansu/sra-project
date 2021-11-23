public static void removeAreaPassTimeLimit() {
    java.util.Calendar temp = java.util.Calendar.getInstance();
    for (int i = 0; i < (com.chris.scrim.VitalizeApplication.allAreas.size()); i++) {
        java.util.Calendar exist = com.chris.scrim.VitalizeApplication.allAreas.get(i).getDate();
        exist.add(java.util.Calendar.MINUTE, 1);
        if (exist.after(temp)) {
            com.chris.scrim.VitalizeApplication.dbHelper.removeScrimAreaDB(com.chris.scrim.VitalizeApplication.allAreas.get(i).getId());
            com.chris.scrim.VitalizeApplication.allAreas.remove(i);
        }
    }
}