private void updateColor(com.jogamp.opengl.GL4 gl2) {
    if (!(isColorUpdateable)) {
        return ;
    }
    java.nio.FloatBuffer buffer = tf.getTexture(((length) / (samples)));
    colorTexture.update(gl2, 0, buffer, new int[]{ (buffer.capacity()) / 4 });
    isColorUpdateable = false;
}