public com.badlogic.gdx.math.Matrix4 getProjection() {
    com.badlogic.gdx.math.Matrix4 trans = getTranslationMatrix();
    com.badlogic.gdx.math.Matrix4 rotX = getXRotationMatrix();
    com.badlogic.gdx.math.Matrix4 rotY = getYRotationMatrix();
    com.badlogic.gdx.math.Matrix4 rotZ = getZRotationMatrix();
    com.badlogic.gdx.math.Matrix4 sc = getScaleMatrix();
    com.badlogic.gdx.math.Matrix4 ans = new com.badlogic.gdx.math.Matrix4(getProjMatrix());
    java.lang.System.out.println(ans);
    ans.mul(trans);
    ans.mul(rotX);
    ans.mul(rotY);
    ans.mul(rotZ);
    return ans.mul(sc);
}