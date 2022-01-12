public void addWorkdays(java.lang.String bId, java.lang.String empId, java.lang.String day, java.lang.String startTime, java.lang.String endTime) {
    java.lang.String combinedData = (((((((bId + " ") + empId) + " ") + day) + " ") + startTime) + " ") + endTime;
    java.io.File file = new java.io.File("workdaysList.txt");
    if ((file.length()) == 0) {
        filewriter.reWriteToWorkingdayTXT("", "workdaysList.txt");
    }else {
        filewriter.WriteToWorkingdayTXT(combinedData, "workdaysList.txt");
    }
}