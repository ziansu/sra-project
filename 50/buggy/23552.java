@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.TextView tv1 = ((android.widget.TextView) (view.findViewById(R.id.textView1)));
    tv1.setText("Hello");
    ((com.example.spff.fc.MainActivity) (getActivity())).switchFragment(2);
}