public static void getUnScheuledHours(java.util.ArrayList<Office> offices) {
    GUI.totalHoursNotScheduled = 0;
    for (Office office : offices) {
        for (int i = 1; i < 37; i++) {
            for (int j = 0; j < 7; j++) {
                if ((office.officeReq.get(i).get(j)) >= 0) {
                    GUI.totalHoursNotScheduled += (office.officeReq.get(i).get(j)) / 2;
                }
            }
        }
    }
}