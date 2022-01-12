protected void onPostExecute(com.cs496.proj2.project2.JoongoEntry j) {
    new com.cs496.proj2.project2.fragments.CTabFragment.PopulateAsyncTask().execute();
}