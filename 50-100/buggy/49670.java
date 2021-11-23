private float getRechargeTime(com.badlogic.gdx.utils.XmlReader.Element basic, com.badlogic.gdx.utils.XmlReader.Element main, com.badlogic.gdx.utils.XmlReader.Element sub) {
    float recharge = basic.getFloat("recharge");
    if ((main.get("recharge", null)) != null)
        recharge = main.getFloat("recharge");
    
    if ((sub.get("recharge", null)) != null)
        recharge = sub.getFloat("recharge");
    
    return recharge;
}