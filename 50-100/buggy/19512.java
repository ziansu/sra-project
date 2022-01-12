@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    commInterface = ((com.nejc.mamiapp.helpers.InterFragmentInterface) (getActivity()));
    adapter_listview_left = new com.nejc.mamiapp.fragments_and_adapters.WeekDaysAdapter(getActivity().getApplicationContext(), false, month, year, commInterface);
    adapter_listview_right = new com.nejc.mamiapp.fragments_and_adapters.WeekDaysAdapter(getActivity().getApplicationContext(), true, month, year, commInterface);
    listview_left.setAdapter(adapter_listview_left);
    listview_right.setAdapter(adapter_listview_right);
}