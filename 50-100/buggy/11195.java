public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    month = month + 1;
    java.lang.String birthdate = (((day + "/") + month) + "/") + year;
    java.lang.String last_date = com.example.mishaberkovich.roomsquad.EditProfileActivity.profile_information.remove(com.example.mishaberkovich.roomsquad.EditProfileActivity.birthdate_loc);
    if (!(last_date.equals(birthdate))) {
        com.example.mishaberkovich.roomsquad.EditProfileActivity.changes_saved = false;
    }
    com.example.mishaberkovich.roomsquad.EditProfileActivity.profile_information.add(com.example.mishaberkovich.roomsquad.EditProfileActivity.birthdate_loc, birthdate);
    com.example.mishaberkovich.roomsquad.EditProfileActivity.displayAge(getActivity());
}