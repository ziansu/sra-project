public static void bindButton(final android.widget.Button button, final nl.jmuijsenberg.androiddemo.viewmodels.base.Command command) {
    if (button != null) {
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                command.execute();
            }
        });
        command.canExecute.addObserver(new nl.jmuijsenberg.androiddemo.viewmodels.base.OnPropertyFieldChanged<java.lang.Boolean>() {
            @java.lang.Override
            public void onPropertyChanged(java.lang.Boolean value) {
                button.setEnabled(value);
            }
        });
    }
}