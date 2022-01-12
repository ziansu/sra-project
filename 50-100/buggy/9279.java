@java.lang.Override
protected void onPostExecute(final java.lang.Boolean success) {
    mAuthTask = null;
    showProgress(false);
    if (success) {
        fr.sims.coachingproject.service.gcmService.RegistrationGCMIntentService.startActionRegistrationGCM(getContext());
        fr.sims.coachingproject.ui.activity.MainActivity.startActivity(getContext());
        fr.sims.coachingproject.util.SharedPrefUtil.putIsFirstLaunch(getContext(), false);
        if ((getActivity()) != null) {
            getActivity().finish();
        }
    }else {
        mPasswordView.setError(getString(R.string.error_incorrect));
        mPasswordView.requestFocus();
    }
}