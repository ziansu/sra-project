@java.lang.Override
public void onClick(android.view.View v) {
    if (etSearch.getText().toString().isEmpty()) {
        android.widget.Toast.makeText(getActivity(), "Please input keywords to search", Toast.LENGTH_SHORT).show();
    }else {
        searchTask = new org.example.team_pigeon.movie_pigeon.SearchPageFragment.SearchTask();
        searchTask.execute(etSearch.getText().toString(), getActivity().getIntent().getExtras().getString("Token").trim());
    }
}