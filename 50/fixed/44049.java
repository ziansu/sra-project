@butterknife.OnClick(value = R.id.today_course_import_or_see_all)
public void seeAll() {
    android.content.Intent through_out = new android.content.Intent(getActivity(), me.gensh.helloustb.Timetable.class);
    startActivity(through_out);
}