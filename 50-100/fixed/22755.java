@java.lang.Override
public android.app.AlertDialog create() {
    android.view.View root = inflateLayout();
    android.app.AlertDialog dialog = super.create();
    android.view.ViewGroup titleContainer = inflateTitleView(root);
    android.widget.TextView messageTextView = initializeMessage(root, titleContainer);
    inflateContentView(root, titleContainer, messageTextView, dialog);
    inflateButtonBar(root, dialog);
    return dialog;
}