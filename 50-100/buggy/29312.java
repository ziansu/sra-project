@java.lang.Override
public void onClick(android.view.View arg0) {
    if (attachment.startsWith(((getString(R.string.todo_title)) + ": "))) {
        android.support.design.widget.TabLayout tabHost = ((android.support.design.widget.TabLayout) (getActivity().findViewById(R.id.tabs)));
        tabHost.getTabAt(3).select();
    }else {
        helper_main.openAtt(getActivity(), listView, attachment);
    }
}