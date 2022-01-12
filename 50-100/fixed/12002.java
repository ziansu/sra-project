@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            break;
        case android.view.MotionEvent.ACTION_UP :
            android.widget.ImageView imageView = ((android.widget.ImageView) (v));
            addAccessory(((java.lang.String) (imageView.getTag())));
            dragBool = false;
            break;
    }
    return true;
}