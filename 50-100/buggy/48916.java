@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    preCheckedItemsLast = new boolean[]{ false , false , false , false , false , false , false , false , false , false , false };
    tv.setText(android.text.Html.fromHtml((("<B>" + (getActivity().getResources().getString(R.string.noFilter))) + "</B>")));
    checkFilterUpdateAdapter();
    contenutoFiltro.setVisibility(View.GONE);
}