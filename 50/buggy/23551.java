public void setBorderColor(com.badlogic.gdx.graphics.Color bordercol) {
    nullParameterCheck(bordercol);
    styleAttribute.borderColour.set(bordercol);
    styleAttribute.checkShaderRequirements();
}