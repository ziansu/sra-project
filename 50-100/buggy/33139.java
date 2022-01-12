void setSlotValueScript(java.lang.String name, java.lang.String expression, java.lang.String where, javax.script.Bindings extra) {
    try {
        extra.put("$$this", bindings.get("$this"));
        if (!(evalCondition(edu.wpi.cetask.Task.makeExpression("$this", getType(), name, expression, false), extra, where)))
            failCheck(name, expression, where);
        else
            modified = true;
        
    } finally {
        extra.remove("$$value");
        extra.remove("$$this");
    }
}