public static void show(android.content.Context context, final java.lang.String text) {
    if ((com.pipi.pipixia.view.FloatView.mWindowManager) == null) {
        com.pipi.pipixia.view.FloatView.init(context);
    }
    android.widget.TextView textView = ((android.widget.TextView) (com.pipi.pipixia.view.FloatView.mView.findViewById(R.id.text)));
    textView.setText(text);
    try {
        com.pipi.pipixia.view.FloatView.mShow = true;
        com.pipi.pipixia.view.FloatView.mWindowManager.addView(com.pipi.pipixia.view.FloatView.mView, com.pipi.pipixia.view.FloatView.mWindowParams);
    } catch (java.lang.Exception e) {
        com.pipi.pipixia.view.FloatView.mShow = false;
        e.printStackTrace();
    }
}