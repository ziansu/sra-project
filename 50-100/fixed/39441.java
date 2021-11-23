public void showProgress(boolean progress) {
    if (progressAllowed) {
        android.view.View view = getActivity().findViewById(R.id.loadingPanel_list);
        if (view != null) {
            if (progress)
                view.setVisibility(View.VISIBLE);
            else
                view.setVisibility(View.GONE);
            
            progressPending = false;
        }
    }else
        progressPending = progress;
    
}