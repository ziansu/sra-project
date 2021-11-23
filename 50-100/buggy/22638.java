@java.lang.Override
public void resize(int width, int height) {
    super.resize(width, height);
    input.getMouse().reinitialize((width / (this.width)), (height / (this.height)));
}