private void initiateCenterCreation(com.mifos.services.data.CenterPayload centerPayload) {
    if (!(isValidCenterName())) {
        return ;
    }
    App.apiManager.createCenter(centerPayload, new retrofit.Callback<com.mifos.objects.group.Center>() {
        @java.lang.Override
        public void success(com.mifos.objects.group.Center center, retrofit.client.Response response) {
            android.widget.Toast.makeText(getActivity(), "Group created successfully", Toast.LENGTH_LONG).show();
        }

        @java.lang.Override
        public void failure(retrofit.RetrofitError error) {
            android.widget.Toast.makeText(getActivity(), "Try again", Toast.LENGTH_LONG).show();
        }
    });
}