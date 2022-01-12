public java.lang.String getinfo() {
    java.lang.String hour = java.lang.String.valueOf(this.hour);
    java.lang.String minute = java.lang.String.valueOf(this.minute);
    if (((this.hour) / 10) == 0)
        hour = "0" + (this.hour);
    
    if (((this.minute) / 10) == 0)
        minute = "0" + (this.minute);
    
    return (hour + ":") + minute;
}