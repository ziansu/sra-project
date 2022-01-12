protected int parseType() {
    if ((this) instanceof cn.bakon.connector.Response.AlarmSetting)
        return this.getError() ? 17 : 1;
    
    if ((this) instanceof cn.bakon.connector.Response.AlarmSwitch)
        return this.getError() ? 18 : 2;
    
    if ((this) instanceof cn.bakon.connector.Response.Password)
        return this.getError() ? 19 : 3;
    
    throw new cn.bakon.BakonException(("unknown type of request: " + (this)));
}