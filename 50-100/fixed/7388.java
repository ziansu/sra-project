int convertSImeiToID(java.lang.String text) {
    if (text == null)
        text = java.util.Calendar.getInstance().getTime().toString();
    
    int sum = 0;
    char[] imei = text.toCharArray();
    for (int i = 0; i < (text.length()); i++)
        sum = sum + (imei[i]);
    
    return 16384 + sum;
}