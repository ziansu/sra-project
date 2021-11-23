static ua.us.Employee getMaxPaym(java.util.ArrayList<ua.us.Employee> emplList) {
    int maxPaym = 0;
    ua.us.Employee emplMaxPaym = new ua.us.Employee();
    for (ua.us.Employee empl : emplList) {
        int curPaym = empl.getPaym();
        if (curPaym > maxPaym) {
            emplMaxPaym = empl;
        }
    }
    return emplMaxPaym;
}