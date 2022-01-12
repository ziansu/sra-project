@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.i(com.ford.emergencyconnect.ResponderCallToActionFragment.FRAGMENT_TAG, "onStart Enter");
    android.widget.Button yesResponse = ((android.widget.Button) (rootView.findViewById(R.id.yesResponse)));
    yesResponse.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.util.Log.i(com.ford.emergencyconnect.ResponderCallToActionFragment.FRAGMENT_TAG, "onClick() - Responder: YES");
            callback.onResponderCallToActionFragmentListener();
        }
    });
}