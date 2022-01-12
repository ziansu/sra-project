private android.view.View getViewReview(int position, android.view.View convertView) {
    review.ReviewCell view;
    if ((convertView == null) || (!(convertView instanceof review.ReviewCell))) {
        view = new review.ReviewCell(context, null);
    }else
        view = ((review.ReviewCell) (convertView));
    
    view.setModel(memoryData.getText(position), recallData.getText(position));
    return view;
}