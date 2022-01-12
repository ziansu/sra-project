public void done(java.util.List<com.parse.ParseObject> subjectList, com.parse.ParseException e) {
    if (e == null) {
        loadSubjectList(subjectList);
        if ((getActivity()) != null) {
            mListSubjects.setAdapter(new tesis.com.estudiemos.adapters.CoursesAdapter(getActivity(), mSubjects));
            mProgressBar.setVisibility(View.GONE);
            mListSubjects.setVisibility(View.VISIBLE);
        }
    }else {
        tesis.com.estudiemos.utils.Logger.debug(("Error: " + (e.getMessage())));
    }
}