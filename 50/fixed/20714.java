@java.lang.Override
public void mouseClicked(Code.Dimension click, Code.RATmouseEvent event) {
    Code.ExpertApp.numbers += ";";
    view.title = Code.ExpertApp.numbers;
    Code.ExpertApp.operators += "*;";
}