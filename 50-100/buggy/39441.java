public void showProgress(boolean progress) {
    if (progressAllowed) {
        if (progress)
            getActivity().findViewById(R.id.loadingPanel_list).setVisibility(View.VISIBLE);
        else
            getActivity().findViewById(R.id.loadingPanel_list).setVisibility(View.GONE);
        
        progressPending = false;
    }else
        progressPending = progress;
    
}