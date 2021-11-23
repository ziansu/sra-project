@java.lang.Override
public void onStop() {
    super.onStop();
    org.huntingtonrobotics.frcrecyclerushpitscouter.PictureUtils.cleanImageView(mPhotoView);
    org.huntingtonrobotics.frcrecyclerushpitscouter.TeamLab.get(getActivity()).saveTeams();
}