@java.lang.Override
public void onClick(android.view.View v) {
    if (isCallaps) {
        if (v instanceof com.app.kongsin.sliduplayout.Item) {
            expand(((com.app.kongsin.sliduplayout.Item) (v)));
        }
    }else {
        if (v instanceof com.app.kongsin.sliduplayout.Item) {
            collapse(((com.app.kongsin.sliduplayout.Item) (v)));
        }
    }
}