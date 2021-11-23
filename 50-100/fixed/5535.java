public void setTagList(java.util.List<com.paulvarry.intra42.api.model.Tags> list) {
    if (list == null) {
        super.setChipList(null);
        return ;
    }
    java.util.List<com.plumillonforge.android.chipview.Chip> chip = new java.util.ArrayList<>();
    for (com.paulvarry.intra42.api.model.Tags t : list) {
        chip.add(t);
    }
    super.setChipList(chip);
}