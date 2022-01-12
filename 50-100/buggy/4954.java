@java.lang.Override
public com.prince.custommap.AutoCompleteAdapter.PredictionHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater mLayoutInflater = ((android.view.LayoutInflater) (mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    android.view.View convertView = mLayoutInflater.inflate(mLayout, parent, false);
    com.prince.custommap.AutoCompleteAdapter.PredictionHolder predictionHolder = new com.prince.custommap.AutoCompleteAdapter.PredictionHolder(convertView);
    return predictionHolder;
}