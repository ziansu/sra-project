@java.lang.Override
public java.lang.String toString() {
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy.MM.dd");
    return ((((((((((((("[" + (format.format(startDate))) + "~") + (format.format(endDate))) + "]") + " [") + "days:") + (diffDays)) + "] [") + "rate:") + (rate)) + "] [") + "amount:") + (amount)) + "]";
}