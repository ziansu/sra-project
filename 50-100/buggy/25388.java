public void toggleSelection(int position, boolean isSelected) {
    arrayList.get(position).isSelected = isSelected;
    if (arrayList.get(position).isSelected) {
        (countSelected)++;
    }else {
        (countSelected)--;
    }
    this.notifyDataSetChanged();
}