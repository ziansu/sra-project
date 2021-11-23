@java.lang.Override
public void openNextScreen() {
    if (!(com.goupwards.util.ValidateUtils.isValidPanNumber(panNumberEditText.getText().toString()))) {
        panNumberEditText.setError("Invalid PAN");
        panNumberEditText.requestFocus();
    }else {
        disableEditing();
        if ((getActivity()) instanceof com.goupwards.home.HomeActivity) {
            com.goupwards.home.HomeActivity activity = ((com.goupwards.home.HomeActivity) (getActivity()));
            activity.changePagerScreen(1);
        }
    }
}