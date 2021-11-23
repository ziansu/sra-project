@java.lang.Override
protected void onPostExecute(java.lang.Void paramas) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.example.mayank.hacknsit.fragments.CameraFragment.mLoadingSpinner.setVisibility(View.VISIBLE);
        }
    });
}