public cameraproject.Model drawTarget(float posX, float posY, float posZ) {
    target.setModel(posX, posY, posZ);
    java.lang.System.out.println(posY);
    return target.model;
}