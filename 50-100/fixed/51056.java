public java.lang.String getWorkDaysString() {
    java.lang.String result = "";
    for (int i = 0; i < 7; i++) {
        if (workDays[i])
            result += (java.lang.String.valueOf((i + 1))) + ",";
        
    }
    if (result.equals(""))
        return result;
    else
        return result.substring(0, ((result.length()) - 1));
    
}