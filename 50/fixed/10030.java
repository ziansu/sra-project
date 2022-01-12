@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser) {
        com.rudie.severin.textadventure.DatabaseClasses.DBInterfacer helper = com.rudie.severin.textadventure.DatabaseClasses.DBInterfacer.getInstance(getActivity());
        setText(charId);
    }
}