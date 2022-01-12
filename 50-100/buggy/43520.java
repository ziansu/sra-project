@java.lang.Override
public void onClick(android.view.View v) {
    if (isCallaps) {
        if (v instanceof com.app.kongsin.sliduplayout.Item) {
            ((com.app.kongsin.sliduplayout.Item) (v)).showImage(true);
            expand(((com.app.kongsin.sliduplayout.Item) (v)));
        }
    }else {
        if (v instanceof com.app.kongsin.sliduplayout.Item) {
            ((com.app.kongsin.sliduplayout.Item) (v)).showImage(false);
            collapse(((com.app.kongsin.sliduplayout.Item) (v)));
        }
    }
}