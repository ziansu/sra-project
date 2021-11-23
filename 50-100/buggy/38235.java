public void run() {
    if ((bitstring[m]) == "1") {
        turnOnFlash();
    }else
        if ((bitstring[m]) == "0") {
            turnOffFlash();
        }
    
    int temp;
    temp = (m) + 1;
    test.setText((("Sending element " + temp) + " of the string."));
    (m)++;
    delay();
}