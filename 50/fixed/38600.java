@java.lang.Override
public void onClick(android.view.View view) {
    int pos = getAdapterPosition();
    com.android.summer.csula.foodvoter.yelpApi.models.Business business = mChoiceData.get(pos).getBusiness();
    mOnClickListener.onListItemClick(business);
}