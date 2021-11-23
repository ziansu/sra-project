public void setShift(Shift shift) {
    switch (shift.getName()) {
        case "Early Morning Shift" :
            earlyMorningShift.setShift(shift);
            break;
        case "Morning Shift" :
            morningShift.setShift(shift);
            break;
        case "Late Morning Shift" :
            lateMorningShift.setShift(shift);
            break;
        case "Surgery Shift" :
            surgeryShift.setShift(shift);
            break;
        case "Overnight Shift" :
            overnightShift.setShift(shift);
            break;
        case "Sunday Shift" :
            sundayShift.setShift(shift);
            break;
        default :
            java.lang.System.out.println("Not a valid shift");
            break;
    }
}