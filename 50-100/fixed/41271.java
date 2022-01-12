public java.lang.String validateTimeFrame(int sDay, int sMonth, int sYear, int fDay, int fMonth, int fYear) {
    java.lang.String output = "";
    if (!(sYear <= fYear)) {
        output = "The start date cannot be later than the finish date";
    }else
        if (!(sMonth <= fMonth)) {
            output = "The start date cannot be later than the finish date";
        }else
            if (!(sDay <= fDay)) {
                output = "The start date cannot be later than the finish date";
            }
        
    
    return output;
}