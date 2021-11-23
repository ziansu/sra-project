public void updateRooms(java.util.List<nl.hs_hague.urbangame.model.Room> newlist, int group) {
    listDataChild.get(listDataHeader.get(group)).clear();
    listDataChild.get(listDataHeader.get(group)).addAll(newlist);
    if (group == 1)
        calculateDistance();
    
    this.notifyDataSetChanged();
}