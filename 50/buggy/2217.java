public void update(java.util.ArrayList<barisic.sandi.onetaptest.model.Weather> newData) {
    mContent.clear();
    mContent.addAll(newData);
    notifyDataSetChanged();
}