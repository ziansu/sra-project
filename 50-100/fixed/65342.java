@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_topic, container, false);
    butterknife.ButterKnife.bind(this, view);
    mFirebaseMessagesRef = new com.firebase.client.Firebase(com.example.guest.bookclub.Constants.FIREBASE_URL_MESSAGES);
    setUpFirebaseQuery();
    setUpRecyclerView();
    return view;
}