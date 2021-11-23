@java.lang.Override
public void resize(int width, int height) {
    super.resize(width, height);
    input.getMouse().reinitialize((((float) (width)) / (this.width)), (((float) (height)) / (this.height)));
}