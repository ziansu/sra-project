@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String last_change = com.example.mishaberkovich.roomsquad.EditProfileActivity.profile_information.remove(com.example.mishaberkovich.roomsquad.EditProfileActivity.tagline_loc);
    java.lang.String new_change = profile_tagline_edit_text.getText().toString();
    if (((last_change != null) && (new_change != null)) && (!(last_change.equals(new_change)))) {
        java.lang.System.out.println("tagline");
        com.example.mishaberkovich.roomsquad.EditProfileActivity.changes_saved = false;
    }
    com.example.mishaberkovich.roomsquad.EditProfileActivity.profile_information.add(com.example.mishaberkovich.roomsquad.EditProfileActivity.tagline_loc, new_change);
}