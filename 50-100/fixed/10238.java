@java.lang.Override
public void run() {
    if ((LoginActivity.user_ref) != null) {
        academy_selected = LoginActivity.user_ref.getInstitution();
        fillSpinnerData(R.id.spinner_faculty, (("Academy/" + (academy_selected)) + "/Faculty"), com.example.academyreviewandrating.NavigationFregmentRankAndReview.spinnerEnum.FACULTY);
    }else {
        android.widget.Toast.makeText(getActivity(), "Timeout has accured", Toast.LENGTH_LONG).show();
    }
}