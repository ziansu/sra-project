@java.lang.Override
public void populateViewHolder(id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment2.BeratHolder beratViewHolder, id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.DataAdapter data, int position) {
    beratViewHolder.setName(data.getTitle());
    beratViewHolder.setText(data.getDesc());
    beratViewHolder.setAbjad(data.getTitle().substring(0, 1));
}