@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((view) == null) {
        view = inflater.inflate(R.layout.fragment_password_recover_step1, null);
        frag_Email = ((com.example.fragments.inputcells.SimpleTextInputCellFragment) (getFragmentManager().findFragmentById(R.id.input_email)));
        view.findViewById(R.id.btn_goNext).setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                goNext();
            }
        });
    }
    return view;
}