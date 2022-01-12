public void refreshAdapter() {
    mailAdapter = new com.sigmobile.dawebmail.adapters.MailAdapter(allEmails, getActivity(), this, com.sigmobile.dawebmail.utils.Constants.SENT);
    android.support.v7.widget.RecyclerView.LayoutManager mLayoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity().getApplicationContext());
    recyclerView.setLayoutManager(mLayoutManager);
    recyclerView.setItemAnimator(new android.support.v7.widget.DefaultItemAnimator());
    recyclerView.setAdapter(mailAdapter);
}