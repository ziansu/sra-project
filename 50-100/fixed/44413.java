@java.lang.Override
public void run() {
    view2.setY(com.example.nayan.gameverson2.tools.Utils.randInt(5, ((com.example.nayan.gameverson2.tools.Utils.heightSize) - ((com.example.nayan.gameverson2.tools.Utils.heightSize) / 2))));
    view.setY(com.example.nayan.gameverson2.tools.Utils.randInt(5, ((com.example.nayan.gameverson2.tools.Utils.heightSize) - ((com.example.nayan.gameverson2.tools.Utils.heightSize) / 2))));
    com.example.nayan.gameverson2.tools.Utils.move(view, view2);
}