public static com.aun.tela.alphabets.application.gui.fragments.MainFragment.ViewHolder setup(com.aun.tela.alphabets.application.gui.fragments.MainFragment.ViewHolder viewHolder, com.aun.tela.alphabets.application.gui.fragments.MainFragment.AdapterItem adapterItem, java.lang.Integer position, java.lang.Boolean isLast) {
    viewHolder.titleBar.setBorderColor(com.aun.tela.alphabets.application.util.Color.random());
    viewHolder.titleBar.setBarColor(-1);
    viewHolder.title.setText(adapterItem.title.toUpperCase());
    viewHolder.title.setTextColor(com.aun.tela.alphabets.application.util.Color.random());
    com.aun.tela.alphabets.application.util.ViewAnimator.springify(viewHolder.itemView);
    viewHolder.itemView.setClickable(true);
    viewHolder.title.setTag(position);
    viewHolder.titleBar.setTag(position);
    return viewHolder;
}