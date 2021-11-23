public int getReq_day() {
    req_day = 0;
    lb.edu.aub.cmps.classes.Day d = req_time.getTimeSlots()[0].getDay();
    req_day = dayToInt(d);
    return req_day;
}