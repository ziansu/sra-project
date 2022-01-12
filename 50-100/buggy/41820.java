protected int parseType() {
    if ((this) instanceof cn.bakon.connector.Response.AlarmSetting)
        return this.getError() ? 1 : 17;
    
    if ((this) instanceof cn.bakon.connector.Response.AlarmSwitch)
        return this.getError() ? 2 : 18;
    
    if ((this) instanceof cn.bakon.connector.Response.Password)
        return this.getError() ? 3 : 19;
    
    throw new cn.bakon.BakonException(("unknown type of request: " + (this)));
}