@java.lang.Override
public void updateBar(float staminaValue) {
    if (staminaValue < 0) {
        staminaValue = 0;
    }
    staminaBar.setProgress((staminaValue / 1000));
    setColor(staminaValue);
}