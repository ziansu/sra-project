@java.lang.Override
protected void onPostExecute(java.lang.Integer result) {
    progressBar.setVisibility(View.GONE);
    if (result == 1) {
        adapter = new noskurt.com.hasilat.news.RecyclerViewAdapter(view.getContext(), feedsList);
        mRecyclerView.setAdapter(adapter);
    }else {
        android.widget.Toast.makeText(getContext(), "Failed to fetch data!", Toast.LENGTH_SHORT).show();
    }
}