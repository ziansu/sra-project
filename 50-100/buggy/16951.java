private android.view.View getRowView(int position, android.view.ViewGroup parent, org.eyeseetea.malariacare.layout.utils.QuestionRow questionRow, org.eyeseetea.malariacare.layout.utils.AutoTabLayoutUtils.ViewHolder viewHolder) {
    android.view.View rowView = getInflater().inflate(R.layout.question_row, parent, false);
    if (questionRow.isCustomTabTableHeader()) {
        getViewTableHeader(((android.widget.LinearLayout) (rowView)), questionRow);
    }else {
        getViewTableContent(position, ((android.widget.LinearLayout) (rowView)), questionRow, viewHolder);
        rowView.setBackgroundResource(org.eyeseetea.malariacare.layout.utils.LayoutUtils.calculateBackgrounds(position));
    }
    return rowView;
}