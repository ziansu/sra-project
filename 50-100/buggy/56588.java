public void init(com.sarmento.mitchell.gradesaver2.model.Term term, int termPosition) {
    this.termPosition = termPosition;
    java.lang.String termName = term.getTermName();
    setText(termName);
    setBackgroundColor(android.support.v4.content.res.ResourcesCompat.getColor(getResources(), R.color.color_a, null));
    setOnClickListener(this);
    if (!(academics.inArchive())) {
        setOnLongClickListener(this);
    }
}