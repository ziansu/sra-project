public void translate(float x, float y, float z) {
    float[] trans = new float[]{ 1 , 0 , 0 , x , 0 , 1 , 0 , -y , 0 , 0 , 1 , z , 0 , 0 , 0 , 1 };
    translateMatrix.setMatrix(trans);
    translateVector.setXYZ(x, (-y), z);
}