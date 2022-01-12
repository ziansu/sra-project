@java.lang.Override
public void onClick(android.view.View view) {
    final boolean star = !(bundle.getBoolean(Constants.STAR));
    final int starDrawable = (star) ? R.drawable.ic_star_selected : R.drawable.ic_star_unselected;
    starView.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(getActivity().getApplicationContext(), starDrawable));
    bundle.putBoolean(Constants.STAR, star);
    android.util.Log.d("id", java.lang.String.valueOf(id));
    onCreateView(inflater, container, savedInstanceState);
}