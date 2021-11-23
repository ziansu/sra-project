private void populateData() {
    java.lang.String name = settings.getString("name", "not_found");
    com.example.david.hackathon.PostInfo pi = new com.example.david.hackathon.PostInfo("title", name, "Go home rn");
    postList.add(pi);
    pi = new com.example.david.hackathon.PostInfo("title", name, "Go home NEBER");
    postList.add(pi);
    pi = new com.example.david.hackathon.PostInfo("title", name, "GO HORT");
    postList.add(pi);
    pAdapter.notifyDataSetChanged();
}