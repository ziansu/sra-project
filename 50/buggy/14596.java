@java.lang.Override
public void onClick(android.view.View view) {
    getItem(position).changeMe(updateItem(cop, bought, perm, cooling));
    myFragment.getActivity().recreate();
}