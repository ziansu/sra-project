@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    java.lang.String userInput = input.getText().toString();
    if ((com.studios.lucian.students.util.Validator.isValidGroupNumber(userInput)) && (!(groupExists(userInput)))) {
        handleCsvFile(file, userInput);
    }else {
        com.studios.lucian.students.util.DialogsHandler.showWrongGroupNumber(userInput, getActivity());
    }
}