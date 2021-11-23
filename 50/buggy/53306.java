public void reloadAllSports() {
    localCopy.clear();
    localCopy.addAll(com.jtcode.sports.Repository.getInstance());
    notifyDataSetChanged();
}