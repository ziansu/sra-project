private void visualizeViews(boolean isConnected) {
    if (isConnected) {
        getActivity().findViewById(R.id.main_noConnection_text).setVisibility(View.INVISIBLE);
        getActivity().findViewById(R.id.main_retry_button).setVisibility(View.INVISIBLE);
        mGridView.setVisibility(View.VISIBLE);
    }else {
        getActivity().findViewById(R.id.gridView_thumbnail).setVisibility(View.INVISIBLE);
        getActivity().findViewById(R.id.main_noConnection_text).setVisibility(View.VISIBLE);
        mGridView.setVisibility(View.VISIBLE);
    }
}