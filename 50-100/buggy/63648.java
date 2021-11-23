private static void writeEvent(int date, int enddate, java.lang.String modifier, java.lang.String event) {
    if (modifier.equals("s")) {
        calIO.CalFile.CalWrite(date, event);
    }else {
        while (date <= enddate) {
            calIO.CalFile.CalWrite(date, event);
            java.lang.System.out.println(calGUI.AddView.Date.getCurDate());
            calGUI.AddView.Date.getNextDay();
            date = calGUI.AddView.Date.getCurDate();
        } 
        calGUI.AddView.Date.resetDate();
    }
}