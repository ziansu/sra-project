@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(org.shingo.shingoeventsapp.ui.events.EventDetailFragment.ARG_ITEM_ID)) {
        org.shingo.shingoeventsapp.ui.events.EventDetailFragment.mEvent_id = getArguments().getString(org.shingo.shingoeventsapp.ui.events.EventDetailFragment.ARG_ITEM_ID);
        mEvent = Events.EVENT_MAP.get(org.shingo.shingoeventsapp.ui.events.EventDetailFragment.mEvent_id);
        org.shingo.shingoeventsapp.api.InitLoader loader = new org.shingo.shingoeventsapp.api.InitLoader(org.shingo.shingoeventsapp.ui.events.EventDetailFragment.mEvent_id, getContext());
        loader.load();
    }
}