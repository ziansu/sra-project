@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case com.code.kawakuti.phonepharmacy.home.MedicinesFragment.SELECT_FILE :
            if (resultCode == (getActivity().RESULT_OK)) {
                import_file_path = data.getData().getPath();
                new com.code.kawakuti.phonepharmacy.home.MedicinesFragment.ImportCSVToDataBaseTask(data.getData()).execute();
            }
            break;
    }
    super.onActivityResult(requestCode, resultCode, data);
}