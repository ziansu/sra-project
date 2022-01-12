@java.lang.Override
public void onClick(android.view.View v) {
    if ((badgeList.size()) != 0) {
        if ((count) < (badgeList.size())) {
            (count)++;
        }else {
            count = 0;
        }
        int resource = getActivity().getResources().getIdentifier(badgeList.get(count).getImgsrc(), "drawable", getActivity().getPackageName());
        badgeImg.setImageResource(resource);
    }
}