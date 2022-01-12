public static void removeAreaPassTimeLimit() {
    int i = 0;
    while (i < (com.chris.scrim.VitalizeApplication.allAreas.size())) {
        java.util.Calendar exist = com.chris.scrim.VitalizeApplication.allAreas.get(i).getDate();
        exist.add(java.util.Calendar.MINUTE, 1);
        java.util.Calendar temp = java.util.Calendar.getInstance();
        if (exist.after(temp)) {
            com.chris.scrim.VitalizeApplication.dbHelper.removeScrimAreaDB(com.chris.scrim.VitalizeApplication.allAreas.get(i).getId());
            com.chris.scrim.VitalizeApplication.allAreas.remove(i);
        }else {
            i++;
        }
    } 
}