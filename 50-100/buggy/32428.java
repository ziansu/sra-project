private void startPlayerService() {
    if (!(mBound)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), au.com.taaffe.spotifystreamer.service.PlayerService.class);
        android.os.Bundle arguments = getArguments();
        if (arguments != null)
            intent.putExtras(getArguments());
        
        getActivity().startService(intent);
    }
}