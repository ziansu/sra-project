public void updateGame() {
    temp += com.base.engine.Time.getDelta();
    float sinTemp = ((float) (java.lang.Math.sin(temp)));
    transform.setM_translation(0, 0, 5);
    transform.setM_rotation(0, (sinTemp * 180), 0);
}