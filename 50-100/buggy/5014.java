@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.dialog_about, container);
    ((com.gc.materialdesign.views.Button) (view.findViewById(R.id.cancleButton))).setOnClickListener(this);
    getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    getDialog().setTitle(R.string.dialog_about_title);
    return view;
}