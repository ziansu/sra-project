@java.lang.Override
public void onCvarChanged(com.google.collinsmith70.diablo.cvar.Cvar<java.lang.Float> cvar, java.lang.Float fromValue, java.lang.Float toValue) {
    if (toValue == 0.0F) {
        this.height = 0.0F;
    }else
        if (toValue == 1.0F) {
            this.height = (this.getClient().getVirtualHeight()) - (font.getLineHeight());
        }else {
            this.height = (this.getClient().getVirtualHeight()) * toValue;
        }
    
}