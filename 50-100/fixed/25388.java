public void toggleSelection(int position) {
    arrayList.get(position).isSelected = !(arrayList.get(position).isSelected);
    if (arrayList.get(position).isSelected) {
        (countSelected)++;
    }else {
        (countSelected)--;
    }
    this.notifyDataSetChanged();
}