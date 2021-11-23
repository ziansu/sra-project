private void populateData() {
    java.lang.String userID = settings.getString(settings.getString("username", ""), "not_found");
    com.example.david.hackathon.PostInfo pi = new com.example.david.hackathon.PostInfo("title", userID, "Go home rn");
    postList.add(pi);
    pi = new com.example.david.hackathon.PostInfo("title", userID, "Go home NEBER");
    postList.add(pi);
    pi = new com.example.david.hackathon.PostInfo("title", userID, "GO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORTGO HORT");
    postList.add(pi);
    pAdapter.notifyDataSetChanged();
}