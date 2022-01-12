public void run() {
    if ((bitstring[m]) == "1") {
        turnOnFlash();
    }else
        if ((bitstring[m]) == "0") {
            turnOffFlash();
        }
    
    (m)++;
    int temp;
    temp = m;
    t.setText((("Sending element " + temp) + " of the string."));
}