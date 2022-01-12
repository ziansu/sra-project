@java.lang.Override
public void onClick(android.view.View v) {
    int index = 0;
    for (int i = 1; i < (day); i++)
        index += (getItinerarySizeByDay(getContext(), i)) - 1;
    
    final int indexToAssign = index;
    mAddBtn.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            uz.samtuit.samapp.helpers.ItineraryHelper.addNewItemFromItinerary(getFragmentManager(), day, indexToAssign);
        }
    });
}