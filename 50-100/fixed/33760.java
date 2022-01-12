private void setChanges(se.sladic.lulealokaltrafik.ResultAdapter.ViewHolder holder, int position) {
    if (dataSet.get(position).hops.equals("0")) {
        holder.byten.setVisibility(View.INVISIBLE);
    }else
        holder.byten.setText(((("Ett byte på " + (dataSet.get(position).altbgStation)) + " kl ") + (dataSet.get(position).altbgTime)));
    
}