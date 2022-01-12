@java.lang.Override
public java.lang.String toString() {
    if ((id) < 0)
        return "< New Session >";
    
    java.util.Date dateObj = new java.util.Date(date);
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("E, MMM dd yyyy");
    java.lang.String result = dateFormat.format(dateObj);
    org.joda.time.DateTime dt = new org.joda.time.DateTime(date);
    org.joda.time.format.DateTimeFormatter dtf = org.joda.time.format.DateTimeFormat.forPattern("E, MMM dd yyyy");
    result = dtf.print(dt);
    if ((sequenceNum) > 0) {
        result += (" (" + (sequenceNum)) + ")";
    }
    return result;
}