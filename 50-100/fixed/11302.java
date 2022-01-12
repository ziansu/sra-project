public ShiftInDay getShift(Shift shift) {
    switch (shift.getName()) {
        case "Early Morning Shift" :
            return earlyMorningShift;
        case "Morning Shift" :
            return morningShift;
        case "Late Morning Shift" :
            return lateMorningShift;
        case "Surgery Shift" :
            return surgeryShift;
        case "Overnight Shift" :
            return overnightShift;
        case "Sunday Shift" :
            return sundayShift;
        default :
            java.lang.System.out.println("Not a valid shift");
            break;
    }
    return null;
}