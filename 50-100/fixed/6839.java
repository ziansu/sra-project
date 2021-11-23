@java.lang.Override
public void onClick(android.view.View v) {
    int index = 0;
    for (int i = 1; i < (day); i++)
        index += (getItinerarySizeByDay(getContext(), i)) - 1;
    
    final int indexToAssign = index;
    uz.samtuit.samapp.helpers.ItineraryHelper.addNewItemFromItinerary(getFragmentManager(), day, indexToAssign);
}