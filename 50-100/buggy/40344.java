@java.lang.Override
public void onStart() {
    super.onStart();
    if ((getActivity()) != null) {
        switch (radonsoft.mireaassistant.helpers.Global.settingsDialogResume) {
            case 1 :
                showInstituteChooseDialog();
                break;
            case 2 :
                showGroupChooseDialog();
                break;
            case 3 :
                aboutMessage();
                break;
            default :
                try {
                    instituteDialog.dismiss();
                    groupDialog.dismiss();
                    aboutDialog.dismiss();
                } catch (java.lang.NullPointerException e) {
                }
                break;
        }
    }
}