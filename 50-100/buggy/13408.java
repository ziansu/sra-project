public void fadeHUD(float tpf, float fadeTime) {
    if ((startTime) == 0)
        return ;
    
    long time = java.lang.System.currentTimeMillis();
    float t = ((float) (time - (startTime))) / fadeTime;
    if (t > 1) {
        startTime = 0;
        return ;
    }
    float colorValue = 1 - t;
    color.a = colorValue;
    textField.setColor(color);
}