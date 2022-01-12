private void getEducationData() {
    mRequest = new com.byteshaft.requests.HttpRequest(getActivity().getApplicationContext());
    mRequest.setOnReadyStateChangeListener(this);
    mRequest.open("GET", AppGlobals.EDUCATION_URL);
    mRequest.send();
}