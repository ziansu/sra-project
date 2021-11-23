@java.lang.Override
public void onClick(android.view.View view) {
    if (validField()) {
        salvaMateria();
        activity = ((br.com.collegenotebook.EditNameDialogListener) (getParentFragment()));
        activity.onFinishEditDialog(materia);
        dismiss();
    }else {
        edtNameSubject.setError("Campo vazio");
    }
}