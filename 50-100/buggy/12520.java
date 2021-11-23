private void setupEventListeners() {
    setOnSearchClickedListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            android.widget.Toast.makeText(getActivity(), "Implement your own in-app search", Toast.LENGTH_LONG).show();
        }
    });
    setOnItemViewClickedListener(new com.karmacons.a123movie.MainFragment.ItemViewClickedListener());
    setOnItemViewSelectedListener(new com.karmacons.a123movie.MainFragment.ItemViewSelectedListener());
}