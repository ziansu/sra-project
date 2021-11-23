@java.lang.Override
public void run() {
    redraw();
    switch (scrollDirection) {
        case LEFT :
            (currentPos)--;
            if ((currentPos) < (-(currentWidth))) {
                currentPos = parentWidth;
            }
            break;
        case RIGHT :
            (currentPos)++;
            if ((currentPos) > (parentWidth)) {
                currentPos = -(currentWidth);
            }
            break;
    }
}