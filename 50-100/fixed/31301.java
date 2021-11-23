@java.lang.Override
public void draw(com.badlogic.gdx.graphics.g2d.Batch batch, float parentAlpha) {
    if ((shader) != null) {
        batch.setShader(shader.getShaderProgram());
        shader.prepare();
        super.draw(batch, parentAlpha);
        batch.setShader(null);
    }else {
        super.draw(batch, parentAlpha);
    }
}