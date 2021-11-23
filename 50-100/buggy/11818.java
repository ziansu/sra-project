public void done(byte[] data, com.parse.ParseException e) {
    if (e == null) {
        android.util.Log.d("test", "We've got data in data.");
        M.setImage(data);
        messages.add(M);
        pb.setProgress(60);
        customAdapter = new com.ferran.yep.views.InboxAdapter(getActivity(), R.layout.custom_inbox_row, messages);
        setListAdapter(customAdapter);
    }else {
    }
}