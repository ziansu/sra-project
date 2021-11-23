public static void main(java.lang.String[] args) {
    src.BuildLogic aBuildLogic = src.BuildLogic.getBuildLogic();
    aBuildLogic.createOBJ("../../resources/cube_100x100x100_Subdivided.obj");
    aBuildLogic.createFigure();
}