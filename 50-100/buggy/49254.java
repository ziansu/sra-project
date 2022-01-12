public void setBackgroundColor(com.badlogic.gdx.graphics.Color backcol) {
    com.lostagain.nl.GWTish.Style.Log.info(("_________________ set backcol to:" + (backcol.toString())));
    nullParameterCheck(backcol);
    styleAttribute.backColor.set(backcol);
    com.lostagain.nl.GWTish.Style.Log.info(("_________________ set backcol to:" + (styleAttribute.backColor.toString())));
    styleAttribute.checkShaderRequirements();
}