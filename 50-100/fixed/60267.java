private void visualizeViews(boolean isConnected) {
    if (isConnected) {
        getActivity().findViewById(R.id.main_noConnection_text).setVisibility(View.INVISIBLE);
        getActivity().findViewById(R.id.main_retry_button).setVisibility(View.INVISIBLE);
        mGridView.setVisibility(View.VISIBLE);
    }else {
        mGridView.setVisibility(View.INVISIBLE);
        getActivity().findViewById(R.id.main_noConnection_text).setVisibility(View.VISIBLE);
        getActivity().findViewById(R.id.main_retry_button).setVisibility(View.VISIBLE);
    }
}