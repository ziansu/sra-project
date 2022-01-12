@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_sidebar, container, false);
    campoOs = view.findViewById(R.id.sidebar_op_text);
    campoMatricula = view.findViewById(R.id.sidebar_user_text);
    campoSenha = view.findViewById(R.id.sidebar_user_password);
    campoOs.setText(os);
    campoMatricula.setText(matricula);
    campoSenha.setText(senha);
    return view;
}