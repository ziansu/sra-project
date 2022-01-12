@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    activity = getActivity();
    list = ((android.widget.ListView) (activity.findViewById(R.id.list)));
    assertNotNull("The list was not loaded", list);
}