public void add(com.example.musedroid.musedroid.Museum item) {
    museumList.add(item);
    notifyItemInserted(((getItemCount()) - 1));
}