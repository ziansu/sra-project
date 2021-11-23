private void decheckAllGlossaries() {
    int index = 0;
    android.view.View listitemview;
    for (com.arnastofnun.idordabanki.Glossary glossary : com.arnastofnun.idordabanki.PickGlossaryFragment.glossaryList) {
        glossary.setSelected(false);
        listitemview = com.arnastofnun.idordabanki.PickGlossaryFragment.listView.getChildAt(index);
        if (listitemview != null) {
            android.widget.ImageView tick = ((android.widget.ImageView) (listitemview.findViewById(R.id.checked_image)));
            listitemview.setBackgroundResource(R.color.glossary_notselected);
            tick.setVisibility(View.INVISIBLE);
        }
        index++;
    }
}