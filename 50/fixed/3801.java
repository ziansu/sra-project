public void onRegistrationSuccess() {
    android.widget.Toast.makeText(getActivity(), "Registration successful", Toast.LENGTH_SHORT).show();
    com.taibah.busservice.utils.Helpers.closeKeyboard(getActivity());
    getActivity().onBackPressed();
}