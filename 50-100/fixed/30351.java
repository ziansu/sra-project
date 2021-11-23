@java.lang.Override
public void handleActionMove(int id, com.kh.beatbot.ui.view.Pointer pos) {
    super.handleActionMove(id, pos);
    if (id != 0)
        return ;
    
    yDragTotal += (lastFrameY) - (pos.y);
    lastFrameY = pos.y;
    if ((java.lang.Math.abs(yDragTotal)) > (com.kh.beatbot.ui.view.BpmView.BPM_INCREMENT_THRESHOLD)) {
        if ((yDragTotal) <= 0) {
            View.context.getMidiManager().decrementBpm();
        }else {
            View.context.getMidiManager().incrementBpm();
        }
        yDragTotal %= com.kh.beatbot.ui.view.BpmView.BPM_INCREMENT_THRESHOLD;
    }
}