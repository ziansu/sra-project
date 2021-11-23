@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(getActivity(), com.example.emiya.myapp8.Open.class);
    startActivity(intent);
    getActivity().finish();
}