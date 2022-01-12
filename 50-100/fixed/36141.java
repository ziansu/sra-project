public void init() {
    textXpos = ((width) / 4) * 3;
    textYpos = (height) / 2;
    buttonXpos = textXpos;
    buttonYpos = (textYpos) + (((height) / 12) * 2);
    buttonH = 50;
    buttonW = 180;
    timerT = millis();
    timerTFlag_1 = true;
}