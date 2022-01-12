public void setShift(Shift shift) {
    switch (shift.getName()) {
        case "Early Morning Shift" :
            earlyMorningShift = shift;
            break;
        case "Morning Shift" :
            morningShift = shift;
            break;
        case "Late Morning Shift" :
            lateMorningShift = shift;
            break;
        case "Surgery Shift" :
            surgeryShift = shift;
            break;
        case "Overnight Shift" :
            overnightShift = shift;
            break;
        case "Sunday Shift" :
            sundayShift = shift;
            break;
        default :
            java.lang.System.out.println("Not a valid shift");
            break;
    }
}