public static int getUnScheuledHours(Office offices) {
    int hoursNotScheduled = 0;
    for (int i = 1; i < 37; i++) {
        for (int j = 0; j < 7; j++) {
            if ((offices.officeReq.get(i).get(j)) >= 0) {
                hoursNotScheduled += offices.officeReq.get(i).get(j);
            }
        }
    }
    return hoursNotScheduled / 2;
}