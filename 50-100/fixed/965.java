@java.lang.Override
public void bind(com.badlogic.gdx.graphics.glutils.ShaderProgram shader, int[] locations) {
    com.badlogic.gdx.graphics.GL30 gl = com.badlogic.gdx.Gdx.gl30;
    if ((vaoDirty) || (!(gl.glIsVertexArray(vaoHandle)))) {
        com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO.tmpHandle.clear();
        gl.glGenVertexArrays(1, com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO.tmpHandle);
        vaoHandle = com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO.tmpHandle.get(0);
        gl.glBindVertexArray(vaoHandle);
        vaoDirty = false;
    }else {
        gl.glBindVertexArray(vaoHandle);
    }
    bindAttributes(shader, locations);
    bindData(gl);
    isBound = true;
}