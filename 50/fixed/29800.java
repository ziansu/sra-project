protected void onPostExecute(java.lang.String[] movies) {
    if (movies != null) {
        adapter.clear();
        for (java.lang.String movie : movies) {
            adapter.add(movie);
        }
    }
}