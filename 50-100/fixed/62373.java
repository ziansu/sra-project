public void setup() {
    setup_util();
    is_loading = true;
    background(0);
    smooth();
    ZenStates.inst = this;
    board = new Blackboard(this);
    canvas = new MainCanvas(this, cp5);
    setup_expression_loading_bug();
    textSize(cp5.getFont().getSize());
    textFont(cp5.getFont().getFont());
    is_loading = false;
}