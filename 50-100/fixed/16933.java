@java.lang.Override
public void onAnimationEnd(com.nineoldandroids.animation.Animator animation) {
    swipeListView.resetScrolling();
    if (swap) {
        boolean aux = !(opened.get(position));
        opened.set(position, aux);
        if (aux) {
            swipeListView.onOpened(position, swapRight);
            openedRight.set(position, swapRight);
        }else {
            onClosed(view, position);
        }
    }
    resetCell();
}