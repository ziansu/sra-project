@java.lang.Override
public void onClick(android.view.View v) {
    switch (brann) {
        case 0 :
            (brann)++;
            iv_mill_brann.setAlpha(((float) (1)));
            tv_mill_brann.setText("x1");
            break;
        default :
            brann = 0;
            iv_mill_brann.setAlpha(((float) (0.5)));
            tv_mill_brann.setText("");
            break;
    }
    updateValues(true);
}