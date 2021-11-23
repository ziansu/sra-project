public void addItem(java.lang.String name, java.lang.String address) {
    mNamesList.add(name);
    mAddressesList.add(address);
    notifyItemInserted(((mNamesList.size()) - 1));
}