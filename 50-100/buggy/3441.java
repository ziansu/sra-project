@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_stage_editing, container, false);
    rootLayout = ((android.view.ViewGroup) (view.findViewById(R.id.view_root)));
    imageView = ((android.widget.ImageView) (view.findViewById(R.id.fullscreen_content)));
    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(150, 150);
    imageView.setLayoutParams(layoutParams);
    imageView.setOnTouchListener(new com.d24.android.pictogramapp.ui.EditingFragment.ChoiceTouchListener());
    rootLayout.addView(imageView);
    return view;
}