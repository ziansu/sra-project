@java.lang.Override
public void onClick(android.view.View v) {
    if ((badgeList.size()) != 0) {
        if ((count) < (badgeList.size())) {
            (count)++;
        }else {
            count = 1;
        }
        int resource = getActivity().getResources().getIdentifier(badgeList.get(((count) - 1)).getImgsrc(), "drawable", getActivity().getPackageName());
        badgeImg.setImageResource(resource);
    }
}