@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if ((frameCount) == (maxFrames)) {
        frameCount -= maxFrames;
    }else {
        (frameCount)++;
    }
}