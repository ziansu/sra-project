private void startPlayerService(android.os.Bundle arguments) {
    if (!(mBound)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), au.com.taaffe.spotifystreamer.service.PlayerService.class);
        if (arguments != null)
            intent.putExtras(getArguments());
        
        getActivity().startService(intent);
    }
}