@java.lang.Override
public void onClick(android.view.View v) {
    cz.pavelpilar.calculator.calculator.Display display = ((cz.pavelpilar.calculator.calculator.Display) (v.findViewById(R.id.history_display)));
    java.lang.String source = display.getSource();
    cz.pavelpilar.calculator.calculator.InputManager.setCurrent(((source.substring(0, source.indexOf(' '))) + "|"));
    if ((mActivity) != null)
        mActivity.finish();
    
}