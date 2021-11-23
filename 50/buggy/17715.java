@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    _adapter = new com.github.weimasoft.joke.list.JokeListAdapter(com.github.weimasoft.joke.list.TestJokeData.getTestData(getActivity().getResources()), getActivity());
    setListAdapter(_adapter);
}